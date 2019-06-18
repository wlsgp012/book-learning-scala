package ch6

object SetTest extends App {
  val unique = Set(10, 20, 30, 20, 20, 10)
  println(unique)
  val sum = unique.reduce(_ + _)
  println(sum)
}
