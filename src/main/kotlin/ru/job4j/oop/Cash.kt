package ru.job4j.oop

fun main() {
    Cash.add("Some value 1")
    Cash.add("Some value 2")
    println(Cash)
    println(Cash.get(2))
}

object Cash {
    private val cash = ArrayList<String>()
    fun add(value: String) = cash.add(value)
    fun getAll() = cash
    fun get(index: Int) = if (index > cash.size - 1) "Value not found" else cash.get(index)
    override fun toString(): String {
        return "All cash value =  $cash)"
    }

}