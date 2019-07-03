package ch8

object AnonymousTest extends App {

  abstract class Listener {def trigger}

  val myListener = new Listener {
    override def trigger { println(s"Trigger at ${new java.util.Date}")}
  }

  myListener.trigger

  class Listening {
    var listener: Listener = null
    def register(l: Listener) { listener = l}
    def sendNotification() { listener.trigger }
  }

  val notification = new Listening()

  notification.register(new Listener {
    override def trigger { println(s"Trigger at ${new java.util.Date}")}
  })

  notification.sendNotification

}
