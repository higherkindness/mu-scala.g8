addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.15.0")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.3.3")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.10")
addSbtPlugin("com.alejandrohdezma" % "sbt-github" % "0.11.2")
addSbtPlugin("com.alejandrohdezma" % "sbt-github-mdoc" % "0.11.2")

dependencyOverrides +=
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5"   