organization := "io.github.nafg"
name := "scheduler"
version := "2.0.0"

scalaVersion := "2.11.11"

crossScalaVersions := Seq("2.10.6", "2.11.11", "2.12.3")

publishMavenStyle := true

publishTo := Some("Scheduler Bintray" at "https://api.bintray.com/maven/naftoligug/maven/scheduler/;publish=1")

credentials ++= sys.env.get("BINTRAYKEY").toSeq.map(Credentials(
  "Bintray API Realm",
  "api.bintray.com",
  "naftoligug",
  _
))
