ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.2.2" % "provided"
  //"org.apache.spark" %% "spark-core" % "2.4.4" % "provided"
)

lazy val root = (project in file("."))
  .settings(
    name := "SparkStreamingCourse"
  )
