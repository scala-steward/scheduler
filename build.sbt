name := "scheduler"

version := "1.1"

organization := "io.github.nafg"

scalaVersion := "2.10.3"

publishMavenStyle := true

publishTo := Some("Scheduler Bintray" at "https://api.bintray.com/maven/naftoligug/maven/scheduler")

credentials += Credentials(
  "Bintray API Realm",
  "api.bintray.com",
  "naftoligug",
  sys.env("BINTRAYKEY")
)
