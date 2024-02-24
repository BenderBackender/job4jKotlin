package ru.job4j.lambda

fun main() {
    val dec = {value:Int -> value-1}
    val squaring = {value:Int -> value*value }
    println(dec(10))
    println(squaring(10))
}