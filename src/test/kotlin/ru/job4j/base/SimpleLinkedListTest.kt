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
    fun Must_ReturnCorrectValue_WhenListAddValue() {
        for (i in 0..10) {
            assertThat(list.get(i)).isEqualTo(i)
        }
    }

    @Test
    fun Must_CorrectIteratorJob_WhenUseIterator() {
        val iterator = list.LinkedListIt()
        for (i in 0..10) {
            assertThat(iterator.next()).isEqualTo(i)
        }
        assertThat(iterator.index).isEqualTo(10)
        assertFailsWith<java.util.NoSuchElementException> { iterator.next() }
        for (i in 9 downTo 0) {
            assertThat(iterator.previous()).isEqualTo(i)
        }
        assertThat(iterator.index).isEqualTo(0)
        assertFailsWith<java.util.NoSuchElementException> { iterator.previous() }
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