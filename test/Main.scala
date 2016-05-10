object Main{
  def main( args: Array[String] ): Unit = {
    assert( Foo(1,"test").i == 1 )
    println(
      ai.x.diff.DiffShow.diff(
        Foo(1,"test"),
        Foo(1,"bar")
      )
    )
    println( Console.GREEN ++ "Hello Test: " ++ Foo(1, "test").toString  ++ Console.RESET )
  }
}
