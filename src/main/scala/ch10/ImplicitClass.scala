package ch10

object ImplicitClass extends App {

  object IntUtils {
    implicit class Fishies(val x: Int){
      def fishes = "Fish" * x
    }
  }
  import IntUtils.Fishies

  println(3.fishes)

}
