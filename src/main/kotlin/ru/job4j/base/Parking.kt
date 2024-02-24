package ru.job4j.base

fun main() {
    var parking1 = Parking(5, 5)
    var parking2 = Parking(size = 5)
    var parking3 = Parking(cost = 10)
    var parking4 = Parking(5, 5, 5)

    println(parking4)
    println(parking3)
    println(parking2)
    println(parking1)
}

data class Parking(private var size: Int = 1, private var cost: Int = 1) {
    constructor(size: Int, cost: Int, range: Int) : this(size*range,cost)

    fun multiCos() = cost * size
}