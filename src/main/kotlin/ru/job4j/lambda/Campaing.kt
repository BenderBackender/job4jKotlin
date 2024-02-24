package ru.job4j.lambda


import java.util.*

fun main() {
    val list = mutableListOf<Campaing>()
    list.add(Campaing("Mercedes", Address("Berlin", "Pushkina", "10"), Date()))
    list.add(Campaing("BMW", Address("Bawaria", "Lenina", "101"), Date()))
    val rsl = getStringDescription(list)
    println(rsl.get(0))
    println(rsl.get(1))

}

fun getStringDescription(list: List<Campaing>) =
    list.map({ el -> "Company name : ${el.name} Addres: ${el.address} Date create : ${el.created}" })

data class Campaing(val name: String, val address: Address, val created: Date)

data class Address(val city: String, val street: String, val house: String)