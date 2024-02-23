package ru.job4j.base

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import kotlin.test.Test


class CalcTest {
    @Test
    fun incTest() {
        assertThat(increment(0)).isEqualTo(1)
    }
    @Test
    fun divideTest() {
        assertThat(divide(10,5)).isEqualTo(2)
    }
    @Test
    fun diffTest(){
        assertThat(difference(10,5)).isEqualTo(5)
    }
    @Test
    fun sumTest(){
        assertThat(sum(10,10)).isEqualTo(20)
    }
    @Test
    fun multiTest() {
        assertThat(multi(10,10)).isEqualTo(100)
    }
    @Test
    fun maxTest() {
       assertThat(maxOnThree(1,2,3)).isEqualTo(3)
       assertThat(maxOnThree(1,5,10)).isEqualTo(10)
       assertThat(maxOnThree(10,50,1)).isEqualTo(50)
       assertThat(maxOnThree(10,10,10)).isEqualTo(10)
       assertThat(maxOnThree(10,10,1)).isEqualTo(10)
       assertThat(maxOnThree(1,10,10)).isEqualTo(10)
       assertThat(maxOnThree(10,1,10)).isEqualTo(10)
    }
}