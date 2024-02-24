package ru.job4j.lambda

import java.util.*
import java.util.stream.Collectors

fun main() {
    val dec = { value: Int -> value - 1 }
    val squaring = { value: Int -> value * value }
    println(dec(10))
    println(squaring(10))
    val list = listOf<Int>(2,8,20)
    println(count(list))

}

fun count(list: List<Int>): Int {
    return list.stream().filter { it > 10 }.map { it + 1 }.collect(Collectors.summingInt() { it })
}