package ch6

object CollectionPatternMatching extends App {
  val statuses = List(500, 404)
  val msg = statuses.head match {
    case x if x < 500 => "ok"
    case _ => "whoah, an error"
  }
  println(msg)

  val msg2 = statuses match {
    case x if x contains 500 => "has error"
    case _ => "okay"
  }
  println(msg2)

  val msg3 = statuses match {
    case List(500, x) => s"Error followed by $x"
    case List(e, x) => s"$e was follwed by $x"
  }
  println(msg3)

  val head = List('r','g','b') match {
    case x :: _ => x
    case Nil => ' '
  }
  println(head)

  val code = ('h', 204, true) match {
    case (_, _, false) => 501
    case ('c', _, true) => 302
    case ('h', x, true) => x
    case (c, x, true) => {
      println(s"Did not expect code $c")
      x
    }
  }
  println(code)
}
