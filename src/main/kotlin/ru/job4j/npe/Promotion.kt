package ru.job4j.npe

import java.util.Date

class Promotion(val name: String, val currency: String, val date: Date) {
    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (this === other) return true
        if (javaClass != other.javaClass) {
            return false
        }
        other as Promotion
        return other.date == date && other.name == name && other.currency == currency
    }

    override fun hashCode(): Int {
        return 101 + date.hashCode() + currency.hashCode() * 3 + date.hashCode() * 2
    }
}