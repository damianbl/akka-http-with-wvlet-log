lazy val akkaHttpVersion = "10.0.7"
lazy val akkaVersion = "2.5.2"
lazy val wvletLogVersion = "1.2.3"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.2"
    )),
    name := "Akka Http with wvlet-log",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream" % akkaVersion,
      "org.wvlet" %% "wvlet-log" % wvletLogVersion,
      "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
      "org.scalatest" %% "scalatest" % "3.0.1" % Test
    )
  )


libraryDependencies += "org.wvlet" %% "wvlet-log" % "(version)"
