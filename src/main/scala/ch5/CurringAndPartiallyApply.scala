package ch5

object CurringAndPartiallyApply extends App{
  def factorOf(x: Int, y: Int) = y % x == 0
  val multipleOf3 = factorOf(3, _)
  val y = multipleOf3(78)
  println(y)

  def curriedFactorOf(x: Int)( y: Int) = y % x == 0
  val isEven  = curriedFactorOf(2) _
  val z = isEven(2)
  println(z)
}
