package ch7

object Arr extends App {
  val colors = Array("red", "green", "blue")
  println(colors)
  colors(0) = "purple"
  println(colors.toString)


}
