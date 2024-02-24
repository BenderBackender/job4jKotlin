package ru.job4j.oop

import java.util.NoSuchElementException

class SimpleLinkedList<T> : Iterable<T>, List<T> {
    private var head: Node<T>? = null
    private var first: Node<T>? = null
    override var size: Int = 0
        get() = field

    fun add(value: T) {
        if (first == null) {
            val node = Node<T>(value)
            first = node
            head = node
        } else {
            head!!.next = Node<T>(value)
            head = head!!.next
        }
        size++
    }

    class Node<K>(val value: K, var next: Node<K>? = null)

    override fun get(index: Int): T {
        val iterator = this.LinkedIt()
        for (i in 0 until index) {
            iterator.next()
        }
        return iterator.next()
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun indexOf(element: T): Int {
        val iterator = this.LinkedIt()
        for (i in 0 until size) {
            if (element!!.equals(iterator.next()))
                return i
        }
        return -1
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun contains(element: T): Boolean {
        for (value in this.LinkedIt()) {
            if (value == element) {
                return true
            }
        }
        return false
    }

    override fun iterator(): Iterator<T> {
        return LinkedIt()
    }

    override fun listIterator(): ListIterator<T> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<T> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<T> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: T): Int {
        var index = -1
        var i = 0
        for (value in this.LinkedIt()) {
            if (value?.equals(element) == true) {
                index = i
            }
            i++
        }
        return index
    }

    inner class LinkedIt : Iterator<T> {
        private var iteratorHead: Node<T>? = first
        override fun hasNext(): Boolean {
            return iteratorHead != null
        }

        override fun next(): T {
            if (!this.hasNext()) {
                throw NoSuchElementException()
            }
            val rsl = iteratorHead!!.value
            iteratorHead = iteratorHead!!.next
            return rsl
        }
    }
}