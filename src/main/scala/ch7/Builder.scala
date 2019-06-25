package ch7

object Builder extends App {
  val b = Set.newBuilder[Char]
  b += 'h'
  b ++= List('e','l','l','o')
  val helloSet = b.result
  println(helloSet)
}
