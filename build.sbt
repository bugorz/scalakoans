addCommandAlias("namaste", "~test-only org.functionalkoans.forscala.Koans")

name := "Scala Koans"

version := "1.0"

scalaVersion := "2.10.4"

traceLevel := -1

logLevel := Level.Info

// disable printing timing information, but still print [success]
showTiming := false

// disable printing a message indicating the success or failure of running a task
showSuccess := false

// append -deprecation to the options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

// disable updating dynamic revisions (including -SNAPSHOT versions)
offline := true

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc(),
	"org.slf4j" % "slf4j-api" % "1.7.2",
	"org.specs2" % "specs2-scalaz-core_2.10" % "7.0.0"
)
