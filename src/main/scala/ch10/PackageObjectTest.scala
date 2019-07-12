package ch10

import scala.collection.immutable.HashMap

object PackageObjectTest extends App {
  println(new Mappy[String, Int]())
  println(new HashMap[Int, Long]())
}
