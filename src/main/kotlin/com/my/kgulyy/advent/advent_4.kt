package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils
import java.util.*

fun main() {
    println(advent4("/advent_4/smoke.test"))
}

fun advent4(inputFilePath: String): Int {
    val inputStream = StringUtils.getResourceFileAsStream(inputFilePath)
    val scanner = Scanner(inputStream)

    val n = scanner.nextInt()
    val fanBlades = LinkedList(MutableList(n) { scanner.nextInt() })

    return 0
}