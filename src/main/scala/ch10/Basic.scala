package ch10

object Basic extends App {

  val t1: (Int, Char) = (1, 'a')
  val t2: (Int, Char) = Tuple2[Int, Char](1, 'a')
  val f1: Int => Int = _ + 2
  val f2: Int => Int = new Function1[Int, Int] {
    override def apply(x: Int): Int = x * 2
  }

  object ImplicitClasses {
    implicit class Hello(s: String) { def hello = s"Hello, $s"}
    def test ={
      println("World".hello)
    }
  }

  ImplicitClasses.test


  object ImplicitParams{
    def greet(name: String)(implicit greeting: String, xx: Int) = s"$greeting, $name $xx"
//    implicit val hi = "Hello"
    implicit val good = "Good morning"
    implicit val x= 1
    def test ={
      println(greet("Developers"))
    }
  }
  ImplicitParams.test

  class Base { var i = 10 }; class Sub extends Base
  def increment[B <: Base](b: Base) = {b.i += 1; b}
  println(increment(new Sub))

  val l: List[Base] = List[Sub]()

}
