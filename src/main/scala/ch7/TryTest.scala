package ch7

object TryTest extends App {
  def loopAndFail(end: Int, failAt: Int): Int ={
    for (i <- 1 to end){
      println(s"$i")
      if(i==failAt) throw new Exception("Too many iterations")
    }
    end
  }
  val t1 = util.Try(loopAndFail(2, 3))
  println(t1)
  val t2 = util.Try(loopAndFail(4, 3))
  println(t2)

  println("="*20)

  def nextError = util.Try{1 / util.Random.nextInt(2)}
  val x = nextError
  println(x)
  val y = nextError
  println(y)

  val input = " 123 "
  println(util.Try(input.toInt))
  val result = util.Try(input.toInt) orElse util.Try(input.trim.toInt)
  result foreach { r => println(s"Parsed '$input' to $r!")}
  val xx = result match {
    case util.Success(x) => Some(x)
    case util.Failure(ex) => {
      println(s"Couldn't parse input '$input'")
      None
    }
  }
  println(xx)

}
