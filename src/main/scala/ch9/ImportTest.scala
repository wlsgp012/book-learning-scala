package ch9

object ImportTest extends App{

  case class Receipt(id: Int, amount: Double, who: String, title: String)

  case class R(amount: Double)

  {
    val latteReceipt = Receipt(123, 4.12, "fred", "Medium Latte")
    import latteReceipt._
    val l = R(4.44)
//    import l._
    println(s"Sold a $title for $amount to $who")
  }

  import util.Random._

  val letters = alphanumeric.take(20).toList.mkString
  println(letters)
  val numbers = shuffle(1 to 20)
  println(numbers)
}
