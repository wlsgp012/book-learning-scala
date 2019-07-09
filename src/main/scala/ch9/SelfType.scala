package ch9

object SelfType extends App {

  class A {
    def hi = "hi"
  }

  trait B {
    self: A =>
    override def toString: String = "B: " + hi
  }

//  class C extends B
  class C extends A with B
  println(new C)

  class TestSuite(suiteName: String) {
    def start(){}
  }

  trait RandomSeeded{
    self: TestSuite =>
    def randomStart(): Unit = {
      util.Random.setSeed(System.currentTimeMillis)
      self.start()
    }
  }

  class IdSpec extends TestSuite("ID Tests") with RandomSeeded {
    def testId(): Unit = {
      println(util.Random.nextInt != 1)
    }

    override def start(): Unit = testId()

    println("Starting...")
    randomStart()
  }

}
