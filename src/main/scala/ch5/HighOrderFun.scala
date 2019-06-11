package ch5

object HighOrderFun extends App{
  def safeStringOp(s: String, f: String => String) = {
    if(s!= null) f(s) else s
  }

}
