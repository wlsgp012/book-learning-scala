package ch5

object FunType extends App {
  def double(x: Int): Int = x * 2

  println(double(5))
  val myDouble: Int => Int = double
  println(myDouble(5))
  val myDoubleCopy = myDouble
  println(myDoubleCopy(5))

  val myDouble2 = double _
  val amount = myDouble2(20)
  println(amount)

  def max(a: Int, b: Int) = if (a > b) a else b
  val maximize: (Int, Int) => Int = max
  println(maximize(50, 30))
  val maximize2 = max _
  println(maximize2(30, 100))

  def logStart() = "=" * 50 + "\nStarting NOW\n" + "=" * 50
  val start: () => String = logStart
  println(start())
}
