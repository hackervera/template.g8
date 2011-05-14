import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  // remove this file if your template doesn't have default plugins
  val akkaRepo	= "Akka Repo" at "http://akka.io/repository" 
  val akkaPlugin = "se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.1"
  val sbtIdeaRepo = "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
  val sbtIdea = "com.github.mpeltonen" % "sbt-idea-plugin" % "0.4.0"
}
