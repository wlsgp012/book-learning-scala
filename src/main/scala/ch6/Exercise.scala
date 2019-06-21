package ch6

import scala.annotation.tailrec

object Exercise extends App {
  //1
  val sol1 = for (x <- 1 to 20; if x % 2 != 0) yield x
  println(sol1)
  //  for (i <- 0L to 9L; j = i * 2 + 1) yield j
  //  0 to 20 filter (_ % 2 != 0)
  //  0 to 9 map (_ *2 +1)

  //2
  def factors(num: Int) = (2 to (num - 1) filter (num % _ == 0)).toList

  println(factors(15))

  def factors2(num: Int): List[Int] = {
    @tailrec
    def x(n: Int, result: List[Int]): List[Int] = n match {
      case n if n == 1 => result
      case n => if (num % n == 0) x(n - 1, n :: result) else x(n - 1, result)
    }

    x(num - 1, Nil)
  }

  println(factors2(15))

  def factorsOfNumbers(l: List[Int]) = l flatMap factors2

  println(factorsOfNumbers(List(9, 11, 13, 15)))

  //3
  def first[A](items: List[A], count: Int): List[A] = {
    //1)
    //    items take count
    //2)
    //    (for(x <- 0 to count-1) yield {items(x)}).toList
    //    (for(x <- 0 until count) yield {items(x)}).toList
    //3)
    //    var c = count
    //    items.foldLeft(List[A]())((r:List[A], i:A) => {
    //      if(c == 0) return r else {
    //        c = c-1
    //        r :+ i
    //      }
    //    })
    //another answer
    //    items.foldLeft[List[A]](Nil)((r, i) => {
    //      if(r.size < count) r :+ i else r
    //    })
    //4)
    //    @tailrec
    //    def x(l: List[A], result:List[A], c: Int):List[A] = l match {
    //      case _::Nil => result
    //      case _::_ if (c == 0) => result
    //      case h::t => x(t, result :+ h, c-1)
    //    }
    //    x(items, Nil,count)
    //    //another answer
        if(count > 0 && items.tail != Nil) items.head :: first(items.tail, count-1)
        else Nil
  }

  println(first(List('a', 't', 'o'), 2))

  //4
  def selectLongestStr(strings: List[String]):String = {
//    strings.fold("")((a,b) => if(a.size > b.size) a else b)
    strings.reduce((a,b) => if(a.size > b.size) a else b)
//    strings.sortBy(0 - _.size).head
  }
  println(selectLongestStr(List("a", "aa", "aaa", "aa")))

  //5
  def reverse1[A](list: List[A]): List[A] = {
    if(list.tail != Nil)  reverse1(list.tail) :+ list.head
    else Nil
  }
  println(reverse1(List(1,2,3,4,5)))
  def reverse2[A](list: List[A]): List[A] = list match {
    case _ :: Nil => Nil
    case h :: t => reverse2(t) :+ h
  }
  println(reverse2(List(1,2,3,4,5)))

  //6
  val pallies = List("Hi", "otto", "yo", "racecar")
  val isPalindrome = (s: String) => s.reverse == s

  def divideByPalidrome(l: List[String]) = {
//    l partition isPalindrome
    l.foldLeft[(List[String],List[String])]((Nil,Nil))((r, s) => r match {
      case (p, np) if isPalindrome(s) => (p:+s, np)
      case (p, np) => (p, np:+s)
    })
  }
  println(divideByPalidrome(pallies))
}
