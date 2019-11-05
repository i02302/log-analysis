name := "stanby-log-analysis"

version := "0.1"

scalaVersion := "2.12.9"

lazy val core = project

lazy val aggregator = project.dependsOn(core)
