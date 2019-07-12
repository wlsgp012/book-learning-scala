package ch10

object TypeTest extends App {

  object TypeFun{
    type Whole = Int
    val x: Whole = 5

    type UserInfo = Tuple2[Int, String]
    val u: UserInfo = new UserInfo(123, "George")
    type T3[A,B,C] = Tuple3[A,B,C]
    val things = new T3(1, 'a', true)
  }

  val x = TypeFun.x
  println(x)
  val u = TypeFun.u
  println(u)
  val things = TypeFun.things
  println(things)

  println("="*20 +"abstract type"+ "="*20)

  class User(val name: String)
  trait Factory{
    type A
    def create: A
  }
  trait UserFactory extends Factory{
    type A = User
    def create = new User("")
  }

  trait Factory2[A] {
    def create:A
  }

  trait UserFactory2 extends Factory2[User] {
    def create = new User("")
  }

}
