package ch10

object TupleAndFunction extends App {
  val x: (Int, Int) = Tuple2(10, 20)
  println("Does the arity = 2? " + (x.productArity == 2))
  val y = (10, 30)
  println(y.productArity)

  println("=" * 20)
  val hello1 = (n: String) => s"Hello, $n"
  val h1 = hello1("Function Literals")
  println(h1)
  val hello2 = new Function1[String, String] {
    override def apply(n: String): String = s"Hello, $n"
  }
  val h2 = hello2("Function1 Instances")

  def hello3 (n: String) ={
    s"Hello, $n"
  }
  println(s"hello1 = $hello1, hello2 = $hello2, hello3 = ${hello3 _}")



  println("=" * 20)


  val doubler = (i: Int) => i * 2
  val plus3 = (i: Int) => i + 3
  val minus10 = (i: Int) => i - 10
  val prependFn = (doubler compose plus3)
  println(prependFn(1))
  val appendFn = (doubler andThen plus3)
  println(appendFn(1))
  val aaaFn = (doubler compose plus3 compose minus10)
  println(aaaFn(1))
}
