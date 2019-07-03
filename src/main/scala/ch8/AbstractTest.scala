package ch8

object AbstractTest extends App {

  abstract class Car {
    val year: Int
    val automatic: Boolean = true

    def color: String

    override def toString: String = s"color is ${color}, year is ${year}"
  }

  //  new Car()
  class RedMini(val year: Int) extends Car {
    def color = "Red"
  }

  val m: Car = new RedMini(2005)
  println(m)



}
