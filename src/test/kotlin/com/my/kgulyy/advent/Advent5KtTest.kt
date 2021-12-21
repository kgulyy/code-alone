package com.my.kgulyy.advent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Advent5KtTest {

    @Test
    fun smokeTest() {
        assertThat(advent5("/advent_5/smoke.test")).isEqualTo("")
    }

    @Test
    fun mainTest() {
        assertThat(advent5("/advent_5/main.test")).isEqualTo("")
    }
}