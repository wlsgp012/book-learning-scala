package ch5

object HighOrderFunctionByBlock extends App {
  def timer[A](f: => A): A = {
    def now = System.currentTimeMillis
    val start = now; val a = f; val end = now
    println(s"Excecuted in ${end - start}ms")
    a
  }

  val veryRandomAmount = timer {
    util.Random.setSeed(System.currentTimeMillis)
    for (i <- 1 to 100000) util.Random.nextDouble
    util.Random.nextDouble
  }
}
