addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.12.0")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.2.3")
addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.3")
addSbtPlugin("com.alejandrohdezma" % "sbt-github" % "0.8.2")
addSbtPlugin("com.alejandrohdezma" % "sbt-github-mdoc" % "0.8.2")
