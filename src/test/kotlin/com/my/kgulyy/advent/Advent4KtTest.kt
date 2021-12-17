package com.my.kgulyy.advent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Advent4KtTest {

    @Test
    fun smokeTest() {
        assertThat(advent4("/advent_4/smoke.test")).isEqualTo(2)
    }

    @Test
    fun myTest() {
        assertThat(advent4("/advent_4/my.test")).isEqualTo(3)
    }

    @Test
    fun mainTest() {
        assertThat(advent4("/advent_4/main.test")).isEqualTo(4257)
    }
}