addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.13.1")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.2.18")
addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.7")
addSbtPlugin("com.alejandrohdezma" % "sbt-github" % "0.9.2")
addSbtPlugin("com.alejandrohdezma" % "sbt-github-mdoc" % "0.9.2")
