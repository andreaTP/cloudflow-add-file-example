import sbtdocker.Instructions._
import sbtdocker._
import staging.CopyFile

lazy val helloWorld =  (project in file("."))
    .enablePlugins(CloudflowApplicationPlugin, CloudflowAkkaPlugin)
    .settings(
      scalaVersion := "2.12.11",
      name := "hello-world",
      version := "0.0.1",
      cloudflowAkkaBaseImage := Some("lightbend/akka-base:2.0.10-cloudflow-akka-2.6.9-scala-2.12"),
      extraDockerInstructions := Seq(
        Add(CopyFile(file("hello.txt")), "/opt/hello.txt")
      )
    )
