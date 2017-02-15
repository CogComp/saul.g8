version := "$projectVersion$"

resolvers ++= Seq(
  "CogComp Software" at "$cogcompMavenRepo$"
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
