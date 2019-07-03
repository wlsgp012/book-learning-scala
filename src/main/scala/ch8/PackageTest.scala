package ch8

package com {
  package oreilly {
    class Config(val baseUrl: String = "http://localhost")
  }
}

import java.util.Date

object PackageTest extends App {

  val d = new Date
  println(d)

  println("Your new UUID is " + {
    import java.util.UUID; UUID.randomUUID
  })

  import collection.mutable.{ArrayBuffer, Queue}
  //  import collection.mutable._

  val b = new ArrayBuffer[String]
  b += "Hello"
  println(b)
  val q = new Queue[Int]
  q.enqueue(3, 4, 5)
  println(q)
  val pop = q.dequeue
  println(pop)
  println(q)

  val m = Map(1 -> 2)
  println(m)

  import collection.mutable.{Map => MutMap, HashMap => HMap}

  val m1 = Map(1 -> 2)
  val m2 = MutMap(2 -> 3)
  println(m2)
  m2.remove(2)
  println(m2)

  val m3 = HMap(22 ->33)

  val url = new com.oreilly.Config().baseUrl
  println(url)

}
