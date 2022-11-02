addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.16.0")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.3.6")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.11")
addSbtPlugin("com.alejandrohdezma" % "sbt-github" % "0.11.3")
addSbtPlugin("com.alejandrohdezma" % "sbt-github-mdoc" % "0.11.3")

dependencyOverrides +=
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5"   