package ch6

object MapTest extends App {
  val colorMap = Map("red" -> 0xFF0000, "green" -> 0xFF00, ("blue", 0xFF))
  println(colorMap("red"))
  println(colorMap("green") | colorMap("blue"))
  println(colorMap.contains("white"))
  for (pairs <- colorMap) {
    println(pairs)
  }
}
