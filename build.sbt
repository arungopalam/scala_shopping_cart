
name := "shopping"

version := "1.0"

scalaVersion := "2.11.0"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq("org.scalatest" % "scalatest_2.11" % "3.0.1" % "test")
libraryDependencies += "org.scalamock" %% "scalamock-scalatest-support" % "3.5.0" % Test
