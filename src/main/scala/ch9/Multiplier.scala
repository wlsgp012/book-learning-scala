package ch9

class Multiplier(val x: Int) {
  def product(y: Int) = x * y
}

object Multiplier {
  def apply(x: Int) = new Multiplier(x)
}

object Tester extends App{
  val tripler = Multiplier(3)
  val result = tripler.product(13)
  println(result)
}