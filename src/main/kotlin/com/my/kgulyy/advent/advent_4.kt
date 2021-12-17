package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils
import java.util.*

fun main() {
    println(advent4("/advent_4/main.test"))
}

fun advent4(inputFilePath: String): Int {
    val inputStream = StringUtils.getResourceFileAsStream(inputFilePath)
    val scanner = Scanner(inputStream)

    val n = scanner.nextInt()
    val initialFan = MutableList(n) { scanner.nextInt() }

    val currentFan = LinkedList(initialFan)
    var sumOfStates = 0

    for (i in 0 until n) {
        if (currentFan == initialFan) {
            sumOfStates++
        }
        val first = currentFan.removeFirst()
        currentFan.addLast(first)
    }

    return n / sumOfStates
}