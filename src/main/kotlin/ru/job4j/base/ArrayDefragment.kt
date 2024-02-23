package ru.job4j.base

fun main() {
    val names = arrayOfNulls<String>(10)
    names.set(5, "NAME")
    names.set(8, "NAME")
    deFragment(names)
    names.forEach { x -> print(x) }
}

fun deFragment(array: Array<String?>) {
    var right = array.size - 1
    for (left in 0 until array.size) {
        if (array[left] == null) {
            for (i in right downTo left) {
                if (array[i] != null) {
                    array[left] = array[i]
                    array[i] = null
                    right = i
                    break
                }
            }
        }
    }
}