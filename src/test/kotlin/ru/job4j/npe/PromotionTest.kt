package ru.job4j.npe

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class PromotionTest {
    @Test
    fun equalsTest() {
        Assertions.assertThat(Promotion("Prom", "USD", Date()).equals(null)).isFalse()
        Assertions.assertThat(
            Promotion("Prom", "USD", Date())
                .equals
                    (Promotion("Prom", "USD", Date()))
        ).isTrue()
    }
}