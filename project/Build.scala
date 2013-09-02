import sbt._
import Keys._
import PlayProject._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "crud-example"
    val appVersion      = "0.1-SNAPSHOT"

    val appDependencies = Seq(
      "crud-module" %% "crud-module" % "0.1-SNAPSHOT"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      resolvers += "local play repo" at "/usr/local/Cellar/play/2.1.3/libexec/repository/local/"
    )

}
