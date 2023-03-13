ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.10"
lazy val root = (project in file("."))
  .settings(
    name := "SBT-Assignment"
  ).aggregate(core,util)
lazy val core = (project in file("core"))
  .settings(
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.2.10" % Test,
      "com.knoldus" % "sbt-assignment" % "0.1.0-SNAPSHOT"
  )).dependsOn(util)
lazy val util = (project in file("util"))
  .settings(
  )
libraryDependencies +="io.snappydata" % "snappydata-jdbc_2.11" % "1.3.1"
libraryDependencies += "joda-time" % "joda-time" % "2.12.2"
updateOptions := updateOptions.value.withCachedResolution(true)
//here we added sbt-assignment (project) as a dependency
//libraryDependencies += "com.knoldus" % "sbt-assignment" % "0.1.0-SNAPSHOT"
