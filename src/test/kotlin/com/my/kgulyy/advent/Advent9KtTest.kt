package com.my.kgulyy.advent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Advent9KtTest {

    @Test
    fun smokeTest() {
        assertThat(advent9("/advent_9/smoke.test")).isEqualTo(3)
    }

    @Test
    fun myTest() {
        assertThat(advent9("/advent_9/my.test")).isEqualTo(5)
    }

    @Test
    fun mainTest() {
        assertThat(advent9("/advent_9/main.test")).isEqualTo(8564)
    }
}