package ru.job4j.base

import org.assertj.core.api.Assertions
import kotlin.test.Test

class ArrayDeFragmentTest {
    @Test
    fun defTest() {
        val str = "Some value"

        val array = arrayOfNulls<String>(101)
        for (i in 0..100 step 5) {
            array.set(i, str)
        }

        val rsl = arrayOfNulls<String>(101)
        for (i in 0..20) {
            rsl.set(i, str)
        }

        deFragment(array)
        Assertions.assertThat(array).isEqualTo(rsl)
    }
}