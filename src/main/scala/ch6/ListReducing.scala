package ch6

object ListReducing extends App {

  println(List(41, 59, 26).max)
  println(List(41, 59, 26).min)
  println(List(5, 6, 7).product)
  println(List(5, 6, 7).sum)
  println(List(5, 6, 7) contains 6)
  println(List(5, 6, 7) endsWith List(6, 7))
  println(List(24, 17, 32) exists (_ < 18))
  println(List(24, 17, 32) forall (_ < 18))
  println(List(0, 4, 3) startsWith List(0))

  println("=" * 20)

  val validations = List(true, true, false, true, true, true)
  val valid1 = !(validations contains false)
  val valid2 = validations forall (_ == true)
  val valid3 = validations.exists(_ == false) == false

  def contains(x: Int, l: List[Int]): Boolean = {
    var a: Boolean = false
    for (i <- l) {
      if (!a) a = (i == x)
    }
    a
  }

  val included = contains(19, List(46, 19, 92))
  println(included)

  def boolReduce(l: List[Int], start: Boolean)(f: (Boolean, Int) => Boolean): Boolean = {
    var a = start
    for (i <- l) a = f(a, i)
    a
  }

  val included2 = boolReduce(List(46, 19, 92), false) { (a, i) => if (a) a else (i == 19) }
  println(included2)

  def reduceOp[A, B](l: List[A], start: B)(f: (B, A) => B): B = {
    var a = start
    for (i <- l) a = f(a, i)
    a
  }

  val included3 = reduceOp(List(46, 19, 92), false) { (a, i) => if (a) a else (i == 19) }
  println(included3)

  val answer = reduceOp(List(11.3, 23.5, 7.2), 0.0)(_ + _)
  println(answer)

  println(List(4, 5, 6).scan(0)(_ + _))


  println("=" * 20)

  val included_with_fold = List(46, 19, 92).foldLeft(false) { (a, i) =>
    if(a) a else (i == 19)
  }
  println(included_with_fold)
  val answer_with_reduce = List(11.3, 23.5, 7.2).reduceLeft(_ + _)
  println(answer_with_reduce)

  List(4, 5, 6).fold("a")(_ + _.toString)
}
