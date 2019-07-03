package ch8

object EtcOfClass extends App {
  println("=" * 20)

  class Printer(msg: String){
    def print(s: String) = println(s"$msg: $s")
    def print(l: Seq[String]) = println(l.mkString(", "))
  }

  new Printer("Today's Report").print("Foggy" :: "Rainy" :: "Hot" :: Nil)

  println("=" * 20)

  class Multiplier(factor: Int) {
    def apply(input: Int) = input * factor
  }

  val tripleMe = new Multiplier(3)

  val tripled = tripleMe.apply(10)
  println(tripled)

  val tripled2 = tripleMe(10)
  println(tripled2)

  val l  = List('a', 'b', 'c')
  println(l(1))
}
