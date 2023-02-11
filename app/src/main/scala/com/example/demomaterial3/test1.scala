package com.example.demomaterial3

import androidx.appcompat.app.AppCompatActivity
import com.example.demomaterial3.compat.ViewBinding
import hobby.chenai.nakam.basis.TAG
import hobby.wei.c.anno.annoid

object test1 extends AppCompatActivity with TAG.ClassName {
  private lazy val testJava = new TestJava
  private lazy val testJava2 = new TestJava2
  // TODO: just test for compile.
  lazy val binding = ViewBinding.activityMain(this)
  private val hello = "hello"

  /** test hi doc. */
  def hi = s"say: $hello world!"

  //def invoKt = test3.INSTANCE.xxx()

  var b = false

  def invoJavaInKt(): Unit = if (!b) {
    b = true
    new Test4().hi()
  }

  import hobby.wei.c.LOG

  def hiJava = {
    LOG.i(annoid.BuildConfig.LIBRARY_PACKAGE_NAME + BuildConfig.XXX + R.id.button_first)

    testJava.hello()
    testJava2.hello()
  }
}
