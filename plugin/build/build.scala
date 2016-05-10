import cbt._
import java.net.URL
import java.io.File
import scala.collection.immutable.Seq

class Build( context: Context ) extends BasicBuild( context ){
  override def dependencies = (
    super.dependencies // don't forget super.dependencies here
    ++
    Seq(
      context.cbtDependency
    )
  )
}
