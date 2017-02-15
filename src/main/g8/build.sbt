version := "$projectVersion$"

resolvers ++= Seq(
  "CogComp Software" at "http://cogcomp.cs.illinois.edu/m2repo/"
)

libraryDependencies += "edu.illinois.cs.cogcomp" %% "saul" % "$saulVersion$"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "$scalaVersion$"
    )),
    name := "$name$"
  )
