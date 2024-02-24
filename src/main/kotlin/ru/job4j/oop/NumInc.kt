package ru.job4j.oop
fun main() {
    val b = NumInc(10, 5)
    println(b.number)
    println(b.step)
    b.step=5
    println(b.step)
}

class NumInc(num: Int, gap: Int) {
    var number = num

    var step = gap
        set(value) {
            if (value % 2 == 0)
                field = value
            else {
                field = value - 1
                printWarning()
            }
        }
    init {
        if (gap % 2 != 0) {
            step = gap - 1
            printWarning()
        }
    }

    private fun printWarning() {
        println("Шаг был установлен на 1 меньше")
    }
}