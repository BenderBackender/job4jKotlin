package ru.job4j

import kotlin.test.Test
import kotlin.test.assertEquals

class KotlinCollectionTest {
    @Test
    fun listTest(){
        val list: List<String> = listOf("This", "Is", "Totally", "Immutable")

        (list as MutableList<String>)[2] = "Not"

        assertEquals(listOf("This", "Is", "Not", "Immutable"), list)

    }
}