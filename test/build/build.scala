import cbt._

class Build( val context: Context ) extends BaseBuild{
  override def dependencies = (
    super.dependencies // don't forget super.dependencies here
    ++
    Seq(
      DirectoryDependency( projectDirectory ++ "/.." )
    )
    ++
    Resolver( mavenCentral ).bind(
      //ScalaDependency( "com.lihaoyi", "ammonite-ops", "0.5.5" )
    )
  )
}
