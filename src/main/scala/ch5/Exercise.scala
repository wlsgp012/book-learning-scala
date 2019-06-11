package ch5

object Exercise extends App {

  //1
  val max = (a: Int, b: Int) => if (a > b) a else b
  val maxInTuple3 = (tuple3: (Int, Int, Int)) => max(max(tuple3._1, tuple3._2), tuple3._3)

  //2
  val randomPick = (f: (Int, Int) => Int) => f(util.Random.nextInt, util.Random.nextInt)
  val randomMax = randomPick(max)
  val min: (Int, Int) => Int = (a: Int, b: Int) => if (a < b) a else b
  val randomMin = randomPick(min)

  val getSecond = () => {
    util.Random.nextInt
    util.Random.nextInt
  }
  val randomPick2 = (num: => Int, f: (Int, Int) => Int) => f(num, num)
  val randomMax2 = randomPick2(getSecond(), max)
  val randomMin2 = randomPick2(getSecond(), min)

  //3
  val sol = (a: Int) => (x: Int) => a * x

  //4
  // tap combinator

  //5
  def square(m: Double) = m * m

  val sq = square _

  //6
  def conditional[A](x: A, p: A => Boolean, f: A => A): A = if(p(x)) f(x) else x

  //7


}
