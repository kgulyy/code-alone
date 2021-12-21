package com.my.kgulyy.advent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Advent7KtTest {

    @Test
    fun smokeTest() {
        assertThat(advent7("/advent_7/smoke.test")).isEqualTo(5)
    }

    @Test
    fun myTest() {
        assertThat(advent7("/advent_7/my.test")).isEqualTo(11)
    }

    @Test
    fun mainTest() {
        assertThat(advent7("/advent_7/main.test")).isEqualTo(4387488)
    }
}