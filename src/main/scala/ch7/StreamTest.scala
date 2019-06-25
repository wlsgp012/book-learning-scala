package ch7

object StreamTest extends App {
  def inc(i: Int): Stream[Int] = Stream.cons(i, inc(i + 1))

  val s = inc(1)
  println(s)

  val l = s.take(5).toList
  println(l)

  println(s)
  println(s.take(10).toList)
  println(s)

  def inc2(head: Int): Stream[Int] = head #:: inc(head + 1)

  def to(head: Char, end: Char): Stream[Char] = (head > end) match {
    case true => Stream.empty
    case false => head #:: to((head+1).toChar, end)
  }

  val chars = to('A', 'F')
  println(chars)
  val hexChars = chars.toList
  println(hexChars)
  println(chars.take(100).toList)
  println(chars)


}
