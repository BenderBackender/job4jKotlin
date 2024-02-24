package ru.job4j.base

import org.assertj.core.api.Assertions.*
import ru.job4j.oop.SimpleLinkedList
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFailsWith


class SimpleLinkedListTest {
    private val list = SimpleLinkedList<Int>()

    @BeforeTest
    fun before() {
        for (i in 0..10) {
            list.add(i)
        }
    }

    @Test
    fun Must_CorrectValue_WhenListAddValue() {
        for (i in 0..10) {
            assertThat(list.get(i)).isEqualTo(i)
        }
    }

    @Test
    fun Must_CorrectIteratorJob_WhenUseIterator() {
        val iterator = list.iterator()
        for (i in 0..10) {
            assertThat(iterator.next()).isEqualTo(i)
        }
        assertFailsWith<java.util.NoSuchElementException> { iterator.next() }
    }

    @Test
    fun Must_Size11_WhenAdd11() {
        assertThat(list.size).isEqualTo(11)
    }

    @Test
    fun Must_ReturnTrue_WhenListContainsSearchElement() {
        for (i in 0..10) {
            assertThat(list.contains(i))
        }
    }

    @Test
    fun Must_ReturnFalse_WhenListNotContainsSearchElement() {
        assertThat(list.contains(1000)).isEqualTo(false)
    }

    @Test
    fun Must_ReturnIndexLastElement_WhenListContainsSearchElement() {
        assertThat(list.indexOf(5)).isEqualTo(5)
    }

    @Test
    fun Must_ReturnFalseValue_WhenListNotContainsSearchElement() {
        assertThat(list.indexOf(100)).isEqualTo(-1)
    }
}