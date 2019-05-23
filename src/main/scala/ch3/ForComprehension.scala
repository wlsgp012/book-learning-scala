package ch3

object ForComprehension extends App {

  for (x <- 1 to 7) {
    println(s"Day $x:")
  }
  //  syntax error
  //  for (x <- 1 to 7
  //       y <- 1 to 7){println(s"Day $x:$y")}
  for {x <- 1 to 7
       y <- 1 to 7} {
    println(s"Day $x:$y")
  }

  val res10 = for (x <- 1 to 7) yield {
    s"Day $x:"
  }
  println(res10)
  for (day <- res10) print(day + ", ")
  println()
  println("==============================")

  val threes = for (i <- 1 to 20 if i % 3 == 0) yield i
  println(threes)

  val powersOf2 = for (i <- 0 to 8; pow = 1 << i) yield pow
  println(powersOf2)

}
