import cbt._
import java.net.URL
import java.io.File
import scala.collection.immutable.Seq

import ammonite.ops._

//cbt:https://github.com/cvogt/cbt.git#80da1d862e49b1812c51e1b0c6eb26947d36f26d
class Build( context: Context ) extends BasicBuild( context ){
  override def dependencies = (
    super.dependencies // don't forget super.dependencies here
    ++
    Resolver( mavenCentral ).bind(
      ScalaDependency( "com.lihaoyi", "ammonite-ops", "0.5.5" )
    )
  )
}
