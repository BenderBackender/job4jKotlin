package ru.job4j.oop

fun main() {
    val profession = Profession("Some Professional")
    println(profession.getName())
    val doctor = Doctor(2, "Josef")
    println(doctor.getName())
    val mechanik = Mechanik(10, "Jogan", 'A')
    println(mechanik.id)
    mechanik.id = 100
    println(mechanik.id)
}

open class Profession(private var name: String) {

    open fun getName() = name
    open fun action() = println("Action")
}

class Doctor(id: Int, name: String) : Profession(name) {
    override fun getName() = "Doctor ${super.getName()}"
    override fun action() {
        super.action()
        println("Im Doctor")
    }
}

open class ProfessionWithCategory(id: Int, name: String, Category: Char) : Profession(name)

class Mechanik(id: Int = 0, var name: String, public var Category: Char) {
    var id = id
        set(value) {
            println("Set")
            field = value
        }
}

class Driver(id: Int, name: String, Category: Char) : ProfessionWithCategory(id, name, Category) {

}