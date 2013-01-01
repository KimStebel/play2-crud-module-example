import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "crud-example"
    val appVersion      = "0.1-SNAPSHOT"

    val appDependencies = Seq(
      "crud-module" % "crud-module_2.9.1" % "0.1-SNAPSHOT"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      resolvers += "local play repo" at "/home/k/opt/play20/framework/../repository/local/"
    )

}
