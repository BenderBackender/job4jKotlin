package ru.job4j.lambda

class HtmlTable {
    fun table(row: Int, cell: Int): String {
        val table = StringBuilder()
        table.apply {
            append("<table>")
            for (i in 0..row) {
                append("<tr>")
                for (i in 0..row) {
                    append("<th>")
                    append("Some value")
                    append("</th>")
                }
                append("</>tr>")
            }
            append("</table>")
        }
        return table.toString()
    }
}