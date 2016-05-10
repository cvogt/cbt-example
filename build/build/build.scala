import cbt._
import java.net.URL
import java.io.File
import scala.collection.immutable.Seq

class Build( context: Context ) extends BuildBuild( context ){
  override def dependencies = (
    super.dependencies // don't forget super.dependencies here
    ++
    Seq(
      BuildDependency( projectDirectory ++ "/../plugin" )
    )
    ++
    Resolver( mavenCentral ).bind(
      ScalaDependency( "com.lihaoyi", "ammonite-ops", "0.5.5" )
    )
  )
}
