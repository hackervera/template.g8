import sbt._

class MyProject(info: ProjectInfo) extends DefaultProject(info) with IdeaProject with AkkaProject{
  // give the user a nice default project!
}
