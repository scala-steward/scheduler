name := "scheduler"

version := "1.1"

organization := "io.github.nafg"

scalaVersion := "2.10.3"

publishMavenStyle := true

val ossSnapshots = "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

val ossStaging   = "Sonatype OSS Staging" at "https://oss.sonatype.org/service/local/staging/deploy/maven2/"

publishTo := Some(if(version.value.trim endsWith "SNAPSHOT") ossSnapshots else ossStaging)

publishArtifact in Test := false

pomIncludeRepository := (_ => false)

pomExtra := (
  <url>https://github.com/nafg/scheduler</url>
  <licenses>
  </licenses>
  <scm>
    <url>https://github.com/nafg/scheduler</url>
    <connection>scm:git:https://github.com/nafg/scheduler</connection>
  </scm>
  <developers>
  </developers>
)

credentials += Credentials(
  "Sonatype Nexus Repository Manager",
  "oss.sonatype.org",
  sys.env("SONATYPE_USER"),
  sys.env("SONATYPE_PASS")
)
