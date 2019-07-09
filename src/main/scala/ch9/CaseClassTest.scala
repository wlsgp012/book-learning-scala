package ch9

object CaseClassTest extends App {

  case class Character(name: String, isThief: Boolean)

  val h = Character("Hadrian", true)

  val r = h.copy(name = "Royce")

  println(h == r)

  val isThief= h match {
    case Character(x, true) => s"$x is a thief"
    case Character(x, false) => s"$x is not a thief"
  }
  println(isThief)
}
