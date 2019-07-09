package ch9

object Cat {
  def main(args: Array[String]): Unit = {
    for(arg <- args){
      println(io.Source.fromFile(arg).mkString)
    }
  }
}
