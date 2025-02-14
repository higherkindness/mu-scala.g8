addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.17.0")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.6.4")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.9.2")
addSbtPlugin("com.alejandrohdezma" % "sbt-github" % "0.12.0")
addSbtPlugin("com.alejandrohdezma" % "sbt-github-mdoc" % "0.12.0")

dependencyOverrides +=
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0"   