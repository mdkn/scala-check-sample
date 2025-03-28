val scala3Version = "3.6.4"

scalafmtOnCompile := true

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-check-sample",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.0" % Test,
      "org.scalacheck" %% "scalacheck" % "1.18.1" % "test"
    )
)
