package ru.job4j.npe

fun main() {
    val bank = BankService()
    bank.addUser(User("6101", "Kesha"))
    var user = bank.findByPassport("6101")
    println(user?.name)
    user = bank.findByPassport("111")
    println(user?.name)
}

class BankService {
    private val users = HashMap<User, ArrayList<Account>>()
    fun addUser(user: User) {
        users.putIfAbsent(user, ArrayList())
    }

    fun findByRequisite(passport: String, requisite: String): Account? {
        val user = findByPassport(passport)
        return users[user]?.stream()
            ?.filter { it.requisite == requisite }?.findFirst()?.get()
    }

    fun findByPassport(passport: String): User? {
        return users.keys.find { it.passport == passport }
    }

    fun addAccount(passport: String, account: Account) {
        val user = findByPassport(passport)
        users[user]?.add(account)
    }

    fun transferMoney(
        srcPassport: String, srcRequisite: String,
        destPassport: String, descRequisite: String, amount: Double
    ): Boolean {
        val source = findByRequisite(srcPassport, srcRequisite)
        val dest = findByRequisite(destPassport, descRequisite)
        return if (source != null && dest != null && amount > source.balance)
            false
        else {
            source!!.balance -= amount
            dest!!.balance += amount
            true
        }

    }
}

data class User(val passport: String, val name: String) {}
data class Account(val requisite: String, var balance: Double) {}