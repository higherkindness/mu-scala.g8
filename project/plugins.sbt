addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.16.2")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.3.8")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.12")
addSbtPlugin("com.alejandrohdezma" % "sbt-github" % "0.11.11")
addSbtPlugin("com.alejandrohdezma" % "sbt-github-mdoc" % "0.11.11")

dependencyOverrides +=
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5"   