name := "stanby-log-analysis"

version := "0.1"

scalaVersion := "2.13.1"

lazy val core = project

lazy val slick = project.dependsOn(core)

lazy val aggregator = project.dependsOn(core, slick)
