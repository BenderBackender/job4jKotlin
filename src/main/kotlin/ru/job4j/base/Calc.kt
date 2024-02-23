package ru.job4j.base

fun increment(value: Int) =
    value.inc()

fun divide(value: Int, div: Int) = value / div
fun difference(value: Int, dif: Int) = value - dif
fun sum(value1: Int, value2: Int) = value1 + value2
fun multi(value1: Int, value2: Int) = value1 * value2

fun maxOnThree(value: Int, value1: Int, value2: Int) =
    if (value >= value1 && value >= value2) {
        value
    } else if (value2 >= value && value2 >= value1) {
        value2
    } else value1
