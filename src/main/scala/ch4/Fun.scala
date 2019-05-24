package ch4

object Fun extends App {

  def hi: String = "hi"
  println(hi)

  def multiplier(x: Int, y: Int): Int = {
    x * y
  }
  println(multiplier(6, 7))

  def safeTrim(s: String): String = {
    if( s == null) return null
    s.trim
  }

  def log(d: Double): Unit = println(f"Got value $d%.2f")
  println(log(2.23535))

  def log2(d: Double) { println(f"Got value $d%.2f") }
  println(log(2.23535))

  def multiplier2(x: Int, y: Int) {
    x * y
  }
  println(multiplier2(6, 7))

  def formatDollar(amt: Double) = f"$$$amt%.2f"

  println(formatDollar {val rate = 1.32; 0.235 + 0.7123 + rate * 5.32 })

}
