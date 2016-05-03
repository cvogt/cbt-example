import cbt._
import java.net.URL
import java.io.File
import scala.collection.immutable.Seq

import ammonite.ops._

class Build( context: Context ) extends BasicBuild( context ){
  override def dependencies = (
    super.dependencies // don't forget super.dependencies here
    ++
    Resolver( mavenCentral ).bind(
      ScalaDependency( "com.lihaoyi", "ammonite-ops", "0.5.5" )
    )
  )
}
