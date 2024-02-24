package ru.job4j.lambda

data class Account(val name: String, val balance: Int) {
}

val predicateForIvan = { e: Account -> e.name.equals("Ivan") && e.balance > 0 }