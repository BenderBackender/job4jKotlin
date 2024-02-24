package ru.job4j.oop

fun main() {
    var student = Student(email = "tema.ru@mail.com")
    println(student)
    Student.printText("Some text")
    var bool = Student().Book()
    bool.read("Book text")
}

data class Student(
    var name: String = "",
    var surname: String = "",
    var phone: String = "",
    var email: String = ""
) {
    companion object {
        fun printText(text: String) {
            println(text)
        }
    }

    inner class Book {
        fun read(text: String) {
            println(text)
        }

    }
}