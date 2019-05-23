package ch3

object Exercise extends App {

  //1
  val name = ""
  //  val name: String = null
  val result1 = name match {
    case null | "" => "n/a"
    case other => other
  }
  //2
  val amount = -1
  println(result1)
  border()
  val result2 = amount > 0 match {
    case true => "greater"
    case false if amount == 0 => "same"
    case false => "less"
  }

  def border = () => println("==========================")

  println(result2)
  border()

  //3
  border()

  //4
  for (x <- 1 to 100) {
    print(x + " ")
    if (x % 5 == 0) println()
  }
  border()

  //5
  for (x <- 1 to 100) {
    x match {
      case num if num % 15 == 0 => println("typesafe")
      case num if num % 3 == 0 => println("type")
      case num if num % 5 == 0 => println("safe")
      case num => println(num)
    }
  }
  border()

  //6
  for (x <- 1 to 100; y = if (x % 15 == 0) "typesafe" else if (x % 3 == 0) "type" else if (x % 5 == 0) "safe" else x) println(y)
  border()

  for (i <- 1 to 100 by 5) {
    println(i)
  }

}
