// addSbtPlugin("com.thesamet" % "sbt-protoc" % "100.9.0") // <-- fails to resolve

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.25")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.9.0"