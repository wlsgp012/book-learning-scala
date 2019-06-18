package ch6

object ListOp extends App {
  val numbers2 = 1 :: 2 :: 3 :: Nil
  println(numbers2)

  val first = Nil.::(1)
  println(first.tail)
  val second = 2 :: first
  println(second.tail == first)

  println("=" * 20)
  println(List(1, 2) ::: List(2, 3))
  println(List(1, 2) ++ Set(3, 4, 3))
  println(Set(3, 4, 3) ++ List(1, 2))
  println(List(1, 2) == List(1, 2))
  println(List(1, 2) == List(2, 1))
  println(List(3, 5, 4, 3, 4).distinct)
  println(List('a', 'b', 'c', 'd') drop 2)
  println(List(23, 8, 14, 21) filter (_ > 18))
  println(List(List(1,2), List(3,4)).flatten)
  println(List(1,2,3,4,5) partition (_ < 3))
  println(List(1, 2, 3).reverse)
  println(List(2,3,5,6) slice (1,3))
  println(List("apple", "to") sortBy (_.size))
  println(List("apple", "to").sorted)
  println(List(0,1,2,3,5,7,9) splitAt 2)
  println(List(2,3,5,7,11,13) take 3)
  println(List(1, 2, 3) zip List("a", "b", "c", "d"))

  val base = List(1, 2, 3, 4)
  println(5 +: base)
  println(5 :: base)

  val appended = base :+ 5
  println(appended)
  val suffix: List[Int] = appended takeRight 3
  println(suffix)
  println(suffix dropRight 2)

  println(List(0,1,0) collect {case 1 => "ok"})
  println(List("milk,tea") flatMap (_.split(',')))
  println(List("milk","tea") map (_.toUpperCase))
}
