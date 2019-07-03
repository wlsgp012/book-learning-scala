package ch8

object ClassTest extends App {

  class User(n: String) {
    val name: String = n

    def greet: String = s"Hello from $name"

    override def toString: String = s"User($name)"
  }

  val u = new User("Zeniba")
  println(u)
  println(u.greet)
  val isAnyRef = u.isInstanceOf[AnyRef]
  println(isAnyRef)

  class User2(val name: String) {
    def greet: String = s"Hello from $name"

    override def toString = s"User2($name)"
  }

  println(new User2("Driss"))

  val users = List(new User2("Shoto"), new User2("Art3mis"), new User2("Aesch"))
  println(users)
  val sizes = users map (_.name.size)
  println(sizes)
  val sorted = users sortBy (_.name)
  println(sorted)
  val third = users find (_.name contains "3")
  println(third)
  val greet = third map (_.greet) getOrElse "hi"
  println(greet)

  println("=" * 20)

  class A {
    def hi = "Hello from A"

    override def toString: String = getClass.getName
  }

  class B extends A

  class C extends B {
    override def hi: String = "hi C -> " + super.hi
  }

  println(new A().hi)
  println(new B().hi)
  println(new C().hi)

  val a: A = new A
  val a1: A = new B
  //  val b: B = new A
  val b: B = new B

  val misc = List(new C, new A, new B)
  println(misc)
  val messages = misc.map(_.hi).distinct.sorted
  println(messages)

  println("=" * 20)

  class Car(val make: String, var reserved: Boolean) {
    def reserve(r: Boolean): Unit = {
      reserved = r
    }
  }

  val t = new Car("Toyota", false)
  t.reserve(true)
  println(s"My ${t.make} is now reserved? ${t.reserved}")

  val t2 = new Car(reserved = false, make = "Tesla")
  println(t2.make)

  class Lotus(val color: String, reserved: Boolean) extends Car("Lotus", reserved)

  val l = new Lotus("Silver", false)
  println(s"Requested a ${l.color} ${l.make}")

  class DefaultCar(val make: String, var reserved: Boolean = true, val year: Int = 2015) {
    override def toString: String = s"$year $make, reserved = $reserved"
  }

  val da = new DefaultCar("Acura")
  println(da)
  val dl = new DefaultCar("Lexus", year = 2010)
  println(dl)
  val dp = new DefaultCar(reserved = false, make = "Porsche")
  println(dp)

  println("=" * 20)

  class Singular[A](element: A) extends Traversable[A] {
    def foreach[B](f:A => B) = f(element)
  }

  val p = new Singular("Planes")
  println(p)
  p foreach println
  val name:String = p.head
  println(name)

  println("=" * 20)

  class RandomPoint{
    val x = {println("creating x"); util.Random.nextInt}
    lazy val y = {println("now y"); util.Random.nextInt}
  }
  val pp = new RandomPoint
  println(s"Location is ${pp.x}, ${pp.y}")
  println(s"Location is ${pp.x}, ${pp.y}")
}
