import cbt._
trait FooTask extends BasicBuild{
  override def compile = {
    println("COMPILING")
    super.compile
  }
  def foo = "Hello Foo"
}