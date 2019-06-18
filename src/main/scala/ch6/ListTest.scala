package ch6

object ListTest extends App {

  val colors = List("red", "green", "blue")
  println(s"I have ${colors.size} colors: $colors")
  println(colors.head)
  println(colors.tail)

  for (c <- colors) {
    println(c)
  }

  colors.foreach(c => println(c))

  val sizes = colors.map(c => c.size)
  println(sizes)

  val numbers = List(32, 95, 24, 21, 17)
  val total = numbers.reduce(_ + _)
  println(total)

  println("=" * 20)

  val primes = List(2, 3, 5, 7, 11, 13)
  var i = primes
  while (!i.isEmpty) {
    print(i.head + ", ")
    i = i.tail
  }

  println("=" * 20)

  def visit(i: List[Int]): Unit = {
    if (i.size > 0) {
      print(i.head + ", ")
      visit(i.tail)
    }
  }

  visit(primes)

  var i2 = primes
  while (i2 != Nil) {
    print(i2.head + ", ")
    i2 = i2.tail
  }

  println("=" * 20)

  val l: List[Int] = List()
  println(l == Nil)

  val m: List[String] = List("a")
  println(m.head)
  println(m.tail == Nil)

}
