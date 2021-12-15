package com.my.kgulyy.advent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Advent2KtTest {

    @Test
    fun mainTest() {
        assertThat(advent2(945747, 130713)).isEqualTo(27711156)
    }

    @Test
    fun smokeTest() {
        assertThat(advent2()).isEqualTo(6)
    }
}