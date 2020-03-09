import higherkindness.mu.rpc.srcgen.Model._

inThisBuild(Seq(
  organization := "$organization$",
  scalaVersion := "$scala_version$",
  scalacOptions += "-language:higherKinds"
))

val protocol = project
  .settings(
    name := "$name;format="norm"$-protocol",

    libraryDependencies ++= Seq(
      // Needed for the generated code to compile
      "io.higherkindness" %% "mu-rpc-channel" % "$mu_version$"
    ),

    // Needed to expand the @service macro annotation
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.patch),

    $if(use_protobuf.truthy)$
    // Generate sources from .proto files
    muSrcGenIdlType := IdlType.Proto,
    $endif$
    $if(use_avro.truthy)$
    // Generate sources from Avro (.avdl, .avpr or .avsc) files
    muSrcGenIdlType := IdlType.Avro,
    $endif$

    // Make it easy for 3rd-party clients to communicate with us via gRPC
    muSrcGenIdiomaticEndpoints := true
  )

val server = project
  .settings(
    name := "$name;format="norm"$-rpc-server",

    libraryDependencies ++= Seq(
      // Needed to build a gRPC client
      "io.higherkindness" %% "mu-rpc-server" % "$mu_version$",

      // Silence all logs in the demo
      "org.slf4j" % "slf4j-nop" % "1.7.30",

      "org.scalatest" %% "scalatest" % "3.1.1" % Test,

      // Needed to build an in-memory server in the test
      "io.higherkindness" %% "mu-rpc-testing" % "$mu_version$" % Test
    )
  )
  .dependsOn(protocol)

val client = project
  .settings(
    name := "$name;format="norm"$-rpc-client",

    libraryDependencies ++= Seq(
      // Needed to build a gRPC client (although you could use mu-rpc-okhttp instead)
      "io.higherkindness" %% "mu-rpc-netty" % "$mu_version$",

      // For console I/O in the demo client
      "dev.profunktor" %% "console4cats" % "0.8.1",

      // Silence all logs in the demo
      "org.slf4j" % "slf4j-nop" % "1.7.30"
    )
  )
  .dependsOn(protocol)

val root = (project in file("."))
  .settings(
    name := "$name;format="norm"$"
  )
  .aggregate(protocol, server, client)
