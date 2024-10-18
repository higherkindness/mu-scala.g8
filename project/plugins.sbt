addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.16.2")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.5.4")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.8.0")
addSbtPlugin("com.alejandrohdezma" % "sbt-github" % "0.12.0")
addSbtPlugin("com.alejandrohdezma" % "sbt-github-mdoc" % "0.12.0")

dependencyOverrides +=
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5"   