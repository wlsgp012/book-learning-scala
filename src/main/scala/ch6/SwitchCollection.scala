package ch6

import collection.JavaConverters._

object SwitchCollection extends App {
  println(List(24,99,104).mkString(", "))
  println(List('f','t'))
  println(List('f','t').toBuffer)
  println(Map("a" -> 1, "b" -> 2).toList)
  println(Map("a" -> 1, "b" -> 2).keySet.toList)
  println(Set(1 -> true, 3 -> true).toMap)
  println(List(2,5,5,3,2).toSet)
  println(List(2,5,5,3,2).toString)

  println("="*20)

  println(List(12, 29).asJava)
  println(new java.util.ArrayList(5).asScala)
}
