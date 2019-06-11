package ch5

object Placeholder extends App {
  def safeStringOp(s: String, f: String => String) = {
    if (s != null) f(s) else s
  }

  println(safeStringOp(null, _.reverse))
  println(safeStringOp("Ready", _.reverse))

  def combination(x: Int, y: Int, f: (Int, Int) => Int) = f(x, y)

  println(combination(23, 12, _ * _))

  def tripleOp(a: Int, b: Int, c: Int, f: (Int, Int, Int) => Int) = f(a, b, c)

  println(tripleOp(23, 92, 14, _ * _ + _))

  def tripleOp1[A, B](a: A, b: A, c: A, f: (A, A, A) => B) = f(a, b, c)

  println(tripleOp1[Int, Int](23, 92, 14, _ * _ + _))
  println(tripleOp1[Int, Double](23, 92, 14, 1.0 * _ / _ / _))
  println(tripleOp1[Int, Boolean](93, 92, 14, _ > _ + _))

}
