name := "scheduler"

ThisBuild / organization := "io.github.nafg.scheduler"
ThisBuild / crossScalaVersions := Seq("2.12.15", "2.13.6", "3.0.0-RC1", "3.0.0-RC2")
ThisBuild / scalaVersion := crossScalaVersions.value.last

sonatypeProfileName := "io.github.nafg"
