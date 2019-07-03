package ch8

object PrivacyControl extends App {

  class User{
    protected val passwd = util.Random.nextString(10)
  }

  class ValidUser extends User {
    def isValid = !passwd.isEmpty
  }

  val isValid = new ValidUser().isValid

//  val passwd = new User().passwd

  class User2(private var passwd: String){
    def update(p:String): Unit = {
      println("Modifying the password!")
      passwd = p
    }
    def validate(p: String) = p == passwd
  }

  val u = new User2("1234")
  println(u)
  val isValid2 = u.validate("4567")
  println(isValid2)
  u.update("4567")
  val isValid3 = u.validate("4567")
  println(isValid3)
}

