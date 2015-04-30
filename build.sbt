name := "scheduler"

version := "1.1.1"

organization := "io.github.nafg"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.5", "2.11.6")

publishMavenStyle := true

publishTo := Some("Scheduler Bintray" at "https://api.bintray.com/maven/naftoligug/maven/scheduler")

credentials ++= sys.env.get("BINTRAYKEY").toSeq.map(Credentials(
  "Bintray API Realm",
  "api.bintray.com",
  "naftoligug",
  _
))
