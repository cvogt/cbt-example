import cbt._
import java.net.URL
import java.io.File
import scala.collection.immutable.Seq

class Build( context: Context ) extends BasicBuild( context ){
  override def dependencies = (
    super.dependencies // don't forget super.dependencies here
    ++
    Resolver( mavenCentral ).bind(
      // automatically add Scala major version to artifact id
      // CBT-style Scala dependency 
      ScalaDependency( "com.lihaoyi", "ammonite-ops", "0.5.5" )
      // or SBT-style Scala dependency
//      "com.lihaoyi" %% "ammonite-ops" % "0.5.5"

      // don't mess with the artifact id
      // CBT-Style Java dependency 
  //    MavenDependency( "com.lihaoyi", "ammonite-ops_2.11", "0.5.5" )
      // or SBT-style Java dependency
    //  "com.lihaoyi" % "ammonite-ops_2.11" % "0.5.5"
    )
  )
}
