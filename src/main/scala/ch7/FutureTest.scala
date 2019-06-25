package ch7

import concurrent.ExecutionContext.Implicits.global
import concurrent.Future
import concurrent.duration._

object FutureTest extends App {
  val f = concurrent.Future { Thread.sleep(5000); println("hi")}
  println("waiting")
  println(f)

  def nextFtr(i: Int = 0) = Future {
    def rand(x: Int) = util.Random.nextInt(x)
    Thread.sleep((rand(5000)))
    if (rand(3) > 0) (i + 1) else throw new Exception
  }

  println(nextFtr(3))

//  Thread.sleep(10000)

  val maxTime = Duration(10, SECONDS)
  val amount  = concurrent.Await.result(nextFtr(5), maxTime)
  println(amount)
}
