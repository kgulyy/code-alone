package com.my.kgulyy.advent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Advent10KtTest {

    @Test
    fun smokeTest() {
        assertThat(advent10("/advent_10/smoke.test")).isEqualTo(8)
    }

    @Test
    fun mainTest() {
        assertThat(advent10("/advent_10/main.test")).isEqualTo(14736)
    }
}