package com.example.demomaterial3

object test {
  private lazy val testJava = new TestJava

  private val hello = "hello"

  /** test hi doc. */
  def hi = s"say: $hello world!"

//  def invoKt = test3.INSTANCE.xxx()

  def hiJava = testJava.hello()
}
