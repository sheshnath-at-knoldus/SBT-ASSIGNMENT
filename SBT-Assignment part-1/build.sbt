ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "SBT-Assignment"
  ).aggregate(core,util)
lazy val core = (project in file("core"))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % Test
  ).dependsOn(util)
lazy val util = (project in file("util"))
  .settings(
  )

libraryDependencies += "com.knoldus" % "sbt-assignment" % "0.1.0-SNAPSHOT"
