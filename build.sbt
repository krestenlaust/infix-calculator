ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.1"

libraryDependencies ++= Seq(
  "org.antlr" % "antlr4-runtime" % "4.13.1",
)

lazy val root = (project in file("."))
  .settings(
    name := "infix-calculator"
  )
