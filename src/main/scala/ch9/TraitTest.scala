package ch9

object TraitTest extends App {

  trait HtmlUtils {
    def removeMarkup(input: String) = {
      input.replaceAll("""</?\w[^>]*>""", "")
        .replaceAll("<.*>", "")
    }

    def greetings = {
      println("HtmlUtils")
    }
  }

  class Page(val s: String) extends HtmlUtils {
    def asPlainText = removeMarkup(s)
  }

  println(new Page("<html><body><h1>Introduction</h1></body></html>").asPlainText)

  trait SafeStringUtils {
    def trimToNone(s: String): Option[String] = {
      Option(s) map (_.trim) filterNot (_.isEmpty)
    }

    def greetings = {
      println("SafeStringUtils")
    }
  }

  class Page2(val s: String) extends SafeStringUtils with HtmlUtils {
    def asPlainText: String = {
      trimToNone(s) map removeMarkup getOrElse "n/a"
    }

    override def greetings: Unit = super.greetings
  }

  println(new Page2("<html><body><h1>Introduction</h1></body></html>").asPlainText)
  println(new Page2(" ").asPlainText)
  println(new Page2(null).asPlainText)

  new Page2(null).greetings

  println("=" * 20)

  trait Base {
    override def toString: String = "Base"
  }

  class A extends Base {
    override def toString: String = "A->" + super.toString
  }

  trait B extends Base {
    override def toString: String = "B->" + super.toString
  }

  trait C extends Base {
    override def toString: String = "C->" + super.toString
  }

  class D extends A with B with C {
    override def toString: String = "D->" + super.toString
  }

  println(new D())

  println("=" * 20 + "//")

  class E

  println(new E() with C with B)

  println("=" * 20  + "//")

  class RGBColor(val color: Int) {
    def hex = f"$color%06x"
  }

  val green = new RGBColor(255 << 8).hex
  println(green)

  trait Opaque extends RGBColor {
    override def hex: String = s"${super.hex}FF"
  }

  trait Sheer extends RGBColor {
    override def hex: String = s"${super.hex}33"
  }

  class Paint(color: Int) extends RGBColor(color) with Opaque

  class Overlay(color : Int) extends RGBColor(color) with Sheer

  val red = new Paint(128 >> 16).hex
  println(red)
  val blue = new Overlay(192).hex
  println(blue)

}
