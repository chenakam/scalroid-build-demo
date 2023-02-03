package com.example.demomaterial3

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import hobby.chenai.nakam.basis.TAG
import hobby.wei.c.anno.annoid
import com.example.demomaterial3.databinding.ActivityMainBinding

object test1 extends AppCompatActivity with TAG.ClassName {
  private lazy val testJava = new TestJava
  private lazy val testJava2 = new TestJava2
  // TODO: just test for compile.
  lazy val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))

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
