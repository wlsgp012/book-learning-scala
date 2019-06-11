package ch5

object PartialFun extends App {

  val statusHandler: PartialFunction[Int, String] = {
    case 200 => "Okay"
    case 400 => "Your Error"
    case 500 => "Our error"
  }

  println(statusHandler(200))
  println(statusHandler.applyOrElse(401, (x: Int) => {println(x); "handled!"}))
  println(statusHandler.andThen(x => {println(x); "hey!"})(500))
}
