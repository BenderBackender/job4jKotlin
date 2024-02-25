package ru.job4j.oop

import java.util.NoSuchElementException

class SimpleLinkedList<T> : Iterable<T>, List<T> {
    private var head: Node<T>? = null
    private var first: Node<T>? = null
    override var size: Int = 0
        private set(value) {
            field = value
        }

    fun add(value: T) {
        if (first == null) {
            val node = Node(value)
            first = node
            head = node
        } else {
            head!!.next = Node(value, null, head)
            head = head!!.next
        }
        size++
    }

    class Node<K>(val value: K? = null, var next: Node<K>? = null, val previous: Node<K>? = null)

    override fun get(index: Int): T {
        val iterator = this.LinkedListIt()
        for (i in 0 until index) {
            iterator.next()
        }
        return iterator.next()
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun indexOf(element: T): Int {
        val iterator = this.LinkedListIt()
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
        for (value in this.LinkedListIt()) {
            if (value == element) {
                return true
            }
        }
        return false
    }

    override fun iterator(): Iterator<T> {
        return LinkedListIt()
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
        for (value in this.LinkedListIt()) {
            if (value?.equals(element) == true) {
                index = i
            }
            i++
        }
        return index
    }

    inner class LinkedListIt : ListIterator<T> {
        var index = -1
            private set(value) {
                field = value
            }
        private var iteratorHead: Node<T> = Node(next = first)


        override fun hasNext(): Boolean = iteratorHead.next != null

        override fun hasPrevious(): Boolean = iteratorHead.previous != null


        override fun next(): T {
            if (!hasNext()) throw NoSuchElementException()

            val value = iteratorHead.next!!.value!!
            iteratorHead = iteratorHead.next!!
            index++
            return value
        }

        override fun nextIndex(): Int = if (!hasNext()) -1 else index + 1

        override fun previous(): T {
            if (!hasPrevious()) throw NoSuchElementException()

            val value = iteratorHead.previous!!.value!!
            iteratorHead = iteratorHead.previous!!
            index--
            return value
        }

        override fun previousIndex(): Int = if (!hasPrevious()) -1 else index - 1
    }
}
