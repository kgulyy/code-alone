package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils
import java.util.*

fun main() {
    println(advent7("/advent_7/my.test"))
}

fun advent7(inputFilePath: String): Int {
    val inputStream = StringUtils.getResourceFileAsStream(inputFilePath)
    val scanner = Scanner(inputStream)

    val n = scanner.nextInt()
    val matrix = Array(n) { IntArray(scanner.nextInt()) { scanner.nextInt() } }

    return 0
}