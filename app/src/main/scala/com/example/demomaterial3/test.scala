package com.example.demomaterial3

import hobby.chenai.nakam.basis.TAG

object test extends TAG.ClassName {
  private lazy val testJava = new TestJava
  private lazy val testJava2 = new TestJava2

  private val hello = "hello"

  /** test hi doc. */
  def hi = s"say: $hello world!"

  //def invoKt = test3.INSTANCE.xxx()

  import hobby.wei.c.LOG

  def hiJava = {
    LOG.i("")
    testJava.hello()
    testJava2.hello()
  }
}
