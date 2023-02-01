package com.example.demomaterial3

import android.view.LayoutInflater
import hobby.chenai.nakam.basis.TAG
import hobby.wei.c.anno.annoid

object test1 extends TAG.ClassName {
  private lazy val testJava = new TestJava
  private lazy val testJava2 = new TestJava2
  lazy val binding = com.example.demomaterial3.databinding.ActivityMainBinding.inflate(LayoutInflater.from(null))

  private val hello = "hello"

  /** test hi doc. */
  def hi = s"say: $hello world!"

  //def invoKt = test3.INSTANCE.xxx()

  def invoJavaInKt(): Unit = new Test4().hi()

  import hobby.wei.c.LOG

  def hiJava = {
    LOG.i(annoid.BuildConfig.LIBRARY_PACKAGE_NAME + BuildConfig.XXX + R.id.button_first)

    testJava.hello()
    testJava2.hello()
  }
}
