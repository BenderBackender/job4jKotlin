package ru.job4j.npe

import ru.job4j.lambda.Address
import ru.job4j.lambda.Message
import java.util.*

fun main() {
    val list = listOf(
        Purchase("Item1", Date(), Address("Rzn", "20", "Kalnoe")),
        Purchase("Item2", Date(), null)
    )
    println(table(list))
}

data class Purchase(val name: String, val created: Date, val address: Address?) {
}

fun table(list: List<Purchase>): String {
    val table = StringBuilder()
    table.apply {
        append("<table>")
        for (purchase in list) {
            append("<tr>")
            purchase.apply {
                append("<th>${name}</th>")
                append("<th>${created}</th>")
                val city = address?.city ?: ""
                val house = address?.house ?: ""
                val street = address?.street ?: ""
                append(
                    "<th>$city $house $street</th>"
                )
            }

            append("</>tr>")
        }
        append("</table>")
    }
    return table.toString()
}