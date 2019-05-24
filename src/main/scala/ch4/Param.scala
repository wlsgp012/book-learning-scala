package ch4

object Param extends App {

  def greet(prefix: String, name: String) = s"$prefix $name"

  val greeting1 = greet("Ms", "Brown")
  println(greeting1)
  val greeting2 = greet(name = "Brown", prefix="Ms")
  println(greeting2)


}
