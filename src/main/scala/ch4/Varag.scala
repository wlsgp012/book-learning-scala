package ch4

object Varag extends App {

  def sum(items: Int*): Int = {
    var total = 0
    for (i <- items) total += i
    total
  }

  println(sum(10 ,20, 30))
  println(sum())
}
