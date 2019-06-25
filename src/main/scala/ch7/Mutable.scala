package ch7

object Mutable extends App {

  val m = Map("AAPL" -> 597, "MSFT" -> 40)
  println(m)
  val n = m - "AAPL" + ("GOOG" -> 521)
  println(n)
  println(m)

  val nums = collection.mutable.Buffer(1)
  println(nums)

  for(i <- 2 to 10) nums += i
  println(nums)

  val l = nums.toList
  println(l)

  val b = m.toBuffer
  b trimStart 1
  b += ("GOOG" -> 521)
  println(b)
  val ib = b.toMap
  println(ib)

  b += ("GOOG" -> 521)
  val l2 = b.toList
  println(l2)
  val s = b.toSet
  println(s)

}
