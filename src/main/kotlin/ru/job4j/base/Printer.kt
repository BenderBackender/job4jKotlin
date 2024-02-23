package ru.job4j.base

fun main() {
    draw(25)
}

fun draw(size: Int) {
    for (line in 0..size) {
        for (i in 0..size) {
            if (line == i || i == size - line)
                print("x")
            else print(" ")
        }
        println()
    }
}