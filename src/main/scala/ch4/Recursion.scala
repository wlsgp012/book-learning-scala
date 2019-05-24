package ch4

import scala.annotation.tailrec

object Recursion extends App {

//  @tailrec
  def power(x: Int, n: Int): Long = {
    if (n >= 1) x * power(x, n - 1)
    else 1
  }
  println(power(2, 8))
  println(power(2, 1))

  @tailrec
  def powerTail(x: Int, n: Int, t: Int = 1): Long = {
    if (n >= 1) powerTail(x, n - 1, x*t)
    else 1
  }
  println(powerTail(2, 8))
  println(powerTail(2, 1))

}
