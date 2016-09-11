import cbt._

//cbt:https://github.com/cvogt/cbt.git#55e5bad90af19376e3bacbedaea8702456f61d39
class Build( val context: Context ) extends BuildBuild{
  override def dependencies = (
    super.dependencies // don't forget super.dependencies here
    ++
    Resolver( mavenCentral ).bind(
      ScalaDependency( "com.lihaoyi", "ammonite-ops", "0.5.5" )
    )
  )
}
