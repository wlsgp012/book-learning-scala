package ch8

package com.jinhye{
  private[jinhye] class Config{
    val url = "http://localhost"
  }
  class Authentication {
    private[this] val password = "jason"
    def validate = password.size > 0
  }
  class Test{
    println(s"url = ${new Config().url}")
  }
}

class PrivacyAccessor extends App{
  val valid = new com.jinhye.Authentication().validate
  println(valid)

  new com.jinhye.Test

//  new com.jinhye.Config

}
