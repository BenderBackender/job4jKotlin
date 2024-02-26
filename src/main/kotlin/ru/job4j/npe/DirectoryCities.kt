package ru.job4j.npe

class DirectoryCities {
    val directory: MutableList<String> by lazy { loadDirectory() }

    private fun loadDirectory() = mutableListOf("City")
}

fun main() {
    val dir = DirectoryCities()
    val string = if (10 / 10 == 1) null else "String"
    dir.directory.add(string?:"empty")
    println(dir.directory)
}