// This build is for this Giter8 template.
// To test the template run `g8` or `g8Test` from the sbt session.
// See http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.
lazy val root = (project in file("."))
  .enablePlugins(ScriptedPlugin)
  .settings(
    name := "mu-scala.g8",
    test in Test := {
      val _ = (g8Test in Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8"),
  )

addCommandAlias("ci-test", "g8Test")

// There are no docs to generate for this project.
// Just define a dummy command to keep the CI happy.
addCommandAlias("ci-docs", "show scalaVersion")

// There is no release process for this project,
// so this is also a dummy command
addCommandAlias("ci-publish", "show scalaVersion")
