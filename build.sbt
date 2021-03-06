name := "testheroku"

version := "1.0"

scalaVersion := "2.11.8"

lazy val root = Project(id = "testheroku", base = file("."))
  .enablePlugins(JavaAppPackaging, UniversalPlugin, UniversalDeployPlugin,PlayScala)

libraryDependencies += jdbc
libraryDependencies += "org.postgresql" % "postgresql" % "9.4.1209.jre7"
