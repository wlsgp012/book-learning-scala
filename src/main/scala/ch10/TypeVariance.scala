package ch10

object TypeVariance extends App {

  class Car {
    override def toString: String = "Car()"
  }

  class Volvo extends Car {
    override def toString: String = "Volvo()"
  }

  class VolvoWagon extends Volvo

//  case class Item[A](a: A){
  case class Item[+A](a: A){
    def get: A = a
  }

//  val c: Item[Car] = new Item[Volvo](new Volvo)
  val c: Item[Car] = new Item[Volvo](new Volvo)

  class Check[-A] {
    def check(a: A) = {}
  }

  def item(v: Item[Volvo])={
    val c: Car = v.get
  }

  def check(v: Check[Volvo]) = {
    v.check(new VolvoWagon())
  }

//  item(new Item[Car](new Car()))

  item(new Item[Volvo](new Volvo))
  item(new Item[VolvoWagon](new VolvoWagon))
  check(new Check[Car])
  check(new Check[Volvo])
//  check(new Check[VolvoWagon])
}
