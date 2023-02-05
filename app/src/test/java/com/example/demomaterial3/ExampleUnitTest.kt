package com.example.demomaterial3

import com.example.demo.test6
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
//        test1.hi()
//        test1.hiJava()
        Test2.hi()
        test6.hi()
        assertEquals(4, 2 + 2)
    }
}