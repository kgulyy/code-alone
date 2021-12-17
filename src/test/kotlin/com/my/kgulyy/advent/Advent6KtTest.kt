package com.my.kgulyy.advent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Advent6KtTest {

    @Test
    fun smokeTest() {
        assertThat(advent6("/advent_6/smoke.test")).isEqualTo("R")
    }

    @Test
    fun myTest() {
        assertThat(advent6("/advent_6/my.test")).isEqualTo("LUU")
    }

    @Test
    fun mainTest() {
        assertThat(advent6("/advent_6/main.test")).isEqualTo("DDDDDDDDDRRRRRRRRRRRRRRRRRRRRR")
    }
}