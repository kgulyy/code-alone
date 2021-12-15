package com.my.kgulyy.advent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Advent3KtTest {

    @Test
    fun smokeTest() {
        assertThat(advent3("/advent_3/smoke.test")).isEqualTo(1)
    }

    @Test
    fun myTest() {
        assertThat(advent3("/advent_3/my.test")).isEqualTo(2)
    }
}