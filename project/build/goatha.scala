import sbt._

class goatha(info: ProjectInfo) extends DefaultWebProject(info) {
  val lift      = "net.liftweb"       % "lift-core"   % "1.1-M8"   % "compile"
  val jetty6    = "org.mortbay.jetty" % "jetty"       % "6.1.19"   % "test"
  val servlet   = "javax.servlet"     % "servlet-api" % "2.5"      % "provided"
  val derby     = "org.apache.derby"  % "derby"       % "10.4.2.0" % "runtime"
  val junit     = "junit"             % "junit"       % "4.5"      % "test"
  val smackRepo = "m2-repository-smack" at "http://maven.reucon.com/public"
}
