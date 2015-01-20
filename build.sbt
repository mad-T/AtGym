name := """AtGym_2.0"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  ws,
  javaWs,
  jdbc,
  "org.xerial" % "sqlite-jdbc" % "3.7.15-M1",
  "org.json"%"org.json"%"chargebee-1.0",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
)
