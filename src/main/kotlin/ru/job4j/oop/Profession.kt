package ru.job4j.oop

open class Profession(var name: String) {

    open fun getName() = name
    open fun action() = println("Action")
}

class Doctor(id: Int, name: String) : Profession(name) {
    override fun getName() = name
    override fun action() {
        super.action()
        println("Im Doctor")
    }
}

open class ProfessionWithCategory(id: Int, name: String, Category: Char) : Profession(name)

class Mechanik(id: Int, name: String, Category: Char) : ProfessionWithCategory(id, name, Category) {
}

class Driver(id: Int, name: String, Category: Char) : ProfessionWithCategory(id, name, Category) {

}