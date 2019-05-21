package ch2

object Exercise extends App {
  // 1
  val x = 0
  val interim1: Double = x * 9/5
  val result1: Double = interim1 + 32

  // 2
  val celsius = 7
  val celsiusInterim1: Double = celsius * 9/5
  val celsiusInterim2: Double = celsiusInterim1 + 32
  val celsiusResult: Int = celsiusInterim2.toInt
  println(celsiusResult)

  //3
  val input = 2.7255
  printf(f"You Owe $$${input.toDouble}%.2f.")
  println()

  //4
  val flag = false
  val result4 = (flag == false)
  val result41 = !flag

  //5
  val n: Int = 128
  println(n)
  val c: Char = n.toChar
  println(c)
  val s: String = c.toString
  println(s)
  val d: Double = s(0).toDouble
  println(d)
  val n2: Int = d.toInt
  println(n2)

}
