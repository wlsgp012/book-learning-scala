package ch3

object Block extends App {
  val amount = {
    val x = 5 * 20
    x + 10
  }
  println(amount)

  val r = {
    val a = 1;
    {
      val b = a * 2;
      {
        val c = b + 4;
        c
      }
    }
  }
  println(r)

  if (47 % 3 > 0) println("Not a multiple of 3")

  val result = if (false) "whta does this return?"
  println(result)

  val x = 10
  val y = 20
  val max = if (x > y) x else y
  println(max)

}
