package ch7

object OptionTest extends App {
  var x: String = "Indeed"
  var a = Option(x)
  println(a)

  x = null
  var b = Option(x)
  println(b)

  println(s"a is defined? ${a.isDefined}")
  println(s"b is not defined? ${a.isEmpty}")

  println("=" * 20)

  def divide(amt: Double, divisor: Double): Option[Double] = {
    if(divisor == 0) None
    else Option(amt/divisor)
  }
  val legit = divide(5,2)
  println(legit)
  val illegit = divide(3, 0)
  println(illegit)

  val odds = List(1, 3, 5)
  val firstOdd = odds.headOption
  println(firstOdd)
  val evens  = odds filter ( _ % 2 == 0)
  val firstEven = evens.headOption
  println(firstEven)

  val words = List("risible", "scavenger", "gist" )
  val uppercase = words find ( w => w == w.toUpperCase)
  println(uppercase)
  val lowerCase = words find ( w => w == w.toLowerCase)
  println(lowerCase)

  val filtered = lowerCase filter (_ endsWith "ible") map (_.toUpperCase)
  println(filtered)
  val exactSize = filtered filter (_.size > 15) map (_.size)
  println(exactSize)
}
