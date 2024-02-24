package ru.job4j.lambda

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import kotlin.test.Test

class AccountLambdaTest {
    @Test
    fun must_ReturnIvanWithPositiveBalance_WhenFilterList() {
        val list = listOf<Account>(
            Account("Ivan", 0),
            Account("SomePeople", 10),
            Account("Ivan", 10)
        )
        assertThat(list.filter(predicateForIvan).get(0)).isEqualTo(Account("Ivan", 10))

    }
}