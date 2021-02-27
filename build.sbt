organization := "io.github.nafg"
name := "scheduler"
version := "2.0.0"

crossScalaVersions := Seq("2.12.13", "2.13.0")
scalaVersion := crossScalaVersions.value.last

publishMavenStyle := true

publishTo := Some("Scheduler Bintray" at "https://api.bintray.com/maven/naftoligug/maven/scheduler/;publish=1")

credentials ++= sys.env.get("BINTRAYKEY").toSeq.map(Credentials(
  "Bintray API Realm",
  "api.bintray.com",
  "naftoligug",
  _
))
