package ch4

import scala.annotation.tailrec

object Exercise extends App {

  //1
  def getAreaOfCircle(r: Double): Double = r * r * Math.PI

  def getAreaOfCircle2(r: Double): Double = Math.pow(r, 2) * Math.PI

  //2
  def getAreaOfCircleWithStr(r: String): Double = r match {
    case null => 0
    case rr if rr.isEmpty => 0
    case rr => getAreaOfCircle(rr.toDouble)
  }

  //  println(getAreaOfCircleWithStr(null))
  //  println(getAreaOfCircleWithStr(""))
  //  println(getAreaOfCircleWithStr("8"))

  //3
  @tailrec
  def printStartToEndByStep(start: Int, end: Int, step: Int): Unit = end < start match {
    case true => ()
    case false => {
      println(start)
      printStartToEndByStep(start + step, end, step)
    }
  }

  printStartToEndByStep(5, 50, 5)

  //4
  def displayTime(millis: Long) = {
    val secs = millis / 1000
    val secondsOfMinute = 60
    val secondsOfHour = secondsOfMinute * 60
    val secondsOfDay = secondsOfHour * 24

    val days = secs / secondsOfDay
    val hours = (secs % secondsOfDay) / secondsOfHour
    val minutes = (secs % secondsOfHour) / secondsOfMinute
    val seconds = (secs % secondsOfMinute)
    s"$days days, $hours hours, $minutes minutes, $seconds seconds"
  }

  println(3600 * 24 * 2 + 3600 * 2 + 60 * 1 + 4)
  println(displayTime(180064000))

  //5
  def powByApi(x: Double, y: Double) = {
    math.pow(x, y)
  }

  def pow(x: Double, y: Double, result: Double = 1): Double = y == 0 match {
    case true => 1
    //    case _ => x * pow(x ,y - 1)
    case _ => x * pow(x, y - 1, result * x)
  }

  println(pow(2, 4))

  //6
  // my solution
  def distance(x: (Int, Int), y: (Int, Int)): (Int, Int) = (x, y) match {
    case ((x1, y1), (x2, y2)) => (x2 - x1, y2 - y1)
  }

  // answer
  def offset(src: (Int, Int), dest: (Int, Int)): (Int, Int) = {
    (dest._1 - src._1, dest._2 - src._2)
  }

  println(distance((1, 1), (5, 5)))

  //7
  def changePos[T1, T2](src: (T1, T2)) = src._2.isInstanceOf[Int] match {
    case true => (src._2, src._1)
    case _ => src
  }

  println(changePos(("HI", 1)))
  println(changePos((1, "HI")))
  println(changePos(("Hey", "HI")))

  //8
  def displayStrForTuples3[A, B, C](src: (A, B, C)) = {
    (src._1, src._1.toString, src._2, src._2.toString, src._3, src._3.toString)
  }

}
