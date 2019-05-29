package ch4

object TypeParameter extends App {

  def identity[T](s: T): T = s

  val a: String = identity("HI")
  println(a)

  val b = identity(100)
  println(b)
}
