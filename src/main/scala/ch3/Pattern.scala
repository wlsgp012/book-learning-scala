package ch3

object Pattern extends App {
  val x1 = 10
  val y1 = 20
  val max2 = x1 > y1 match {
    case true => x1
    case false => y1
  }
  println(max2)

  val status = 500
  val message = status match {
    case 200 => "ok"
    case 400 => {
      println("Error - we called the service incorrectly")
      "error"
    }
    case 500 => {
      println("Error - the service encountered an error")
      "error"
    }
  }
  println(message)

  val day = "MON"
  val kind = day match {
    case "MON" | "TUE" | "WED" | "THU" | "FRI" => "weekday"
    case "SAT" | "SUN" => "weekend"
  }
  println(kind)

  //  val test = "match me" match { case "nope" => "sorry"}
  //  println(test)

  val msg = "OK1"
  val st = msg match {
    case "OK" => 200
    case other => {
      println(s"Couldn't parse $other")
      -1
    }
  }
  println(st)


  val msg1 = "Unauthorized"
  val st1 = msg1 match {
    case "OK" => 200
    case _ => {
      println(s"Couldn't parse $msg1")
      -1
    }
  }
  println(st1)

  val response = null
  val rr = response match {
    case s if s != null => println(s"Received '$s'")
    case s => println("Error! Received a null response")
  }

  val x: Int = 12180
  val y: Any = x
  val z = y match {
    case s: String => s"'x'"
    case s: Double => f"$x%.2f"
    case s: Float => f"$x%.2f"
    case s: Long => s"${x}l"
    case s: Int => s"${x}i"
  }
  println(z)
}
