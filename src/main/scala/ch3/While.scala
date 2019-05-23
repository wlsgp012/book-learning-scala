package ch3

object While extends App {

  var x = 10
  while (x > 0) {
    println(x)
    x -= 1
  }

  var y = 10
  do println(s"Here I am, y = $y") while (x > 0)
}
