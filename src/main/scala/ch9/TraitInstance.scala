package ch9

object TraitInstance extends App{

  class A

  trait B {self:A => }

  val a = new A with B

  class User(val name: String){
    def suffix = ""

    override def toString: String = s"$name$suffix"
  }

  trait Attorney {self: User =>override def suffix: String = ", esq."}
  trait Wizard {self: User =>override def suffix: String = ", Wizard."}
  trait Reverser {override def toString: String = super.toString.reverse}

  val h = new User("Harry P") with Wizard
  println(h)
  val g = new User("Ginny W") with Attorney
  println(g)
  val l = new User("Luna L") with Wizard with Reverser
  println(l)
}
