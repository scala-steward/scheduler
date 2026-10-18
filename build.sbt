name := "scheduler"

ThisBuild / organization := "io.github.nafg.scheduler"
ThisBuild / crossScalaVersions := Seq("2.12.21", "3.10.0", "3.3.8")
ThisBuild / scalaVersion := crossScalaVersions.value.last
ThisBuild / githubWorkflowJavaVersions := Seq(JavaSpec.temurin("17"))
