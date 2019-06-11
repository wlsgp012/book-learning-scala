package ch5

object ByName extends App {

  def doubles(x: => Int) = {
    println("Now doubling " + x)
    x * 2
  }

  doubles(5)

  def f(i: Int) = {
    println(s"Hello from f($i)")
    i
  }

  doubles(f(8))

  println("=" * 20)

  def whileLoop(condition: => Boolean)(body: => Unit): Unit ={
    if (condition) {
      body
      whileLoop(condition)(body)
    }
//    println("loop finished")
  }

  var i = 2

  whileLoop (i > 0) {
    println(i)
    i -= 1
  }
}
