package ch10

object Bound extends App {

  class Person

  class BaseUser(val name: String) extends Person

  class Admin(name: String, val level: String) extends BaseUser(name)

  class Customer(name: String) extends BaseUser(name)

  class PreferredCustomer(name: String) extends Customer(name)

  def check[A <: BaseUser](u: A): Unit = {
    if(u.name.isEmpty) println("Fail!")
  }

//  check(new Person)
  check(new Customer("Fred"))
  check(new Admin("","Fred"))


  def recruit[A >: Customer](u: Customer): A = u match {
    case _: PreferredCustomer => new PreferredCustomer(u.name)
    case _: Customer => new Customer(u.name)
  }

  val customer = recruit(new Customer("Fred"))
  println(customer)
  val preferred: Customer = recruit(new PreferredCustomer("George"))
//  val preferred: PreferredCustomer = recruit(new PreferredCustomer("George"))
  println(preferred)

  abstract class Card{
    type UserType <: BaseUser
    def verify(u: UserType): Boolean
  }

  class SecurityCard extends Card{
     type UserType = Admin
    def verify(u: Admin) = true

  }

  val v1 = new SecurityCard().verify(new Admin("George", "high"))
  println(v1)

  class GiftCard extends Card {
    type UserType = Customer
    def verify(u: Customer) = true
  }

  val v2 = new GiftCard().verify(new Customer("Fred"))
  println(v2)
}
