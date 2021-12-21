package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils
import java.util.*

fun main() {
    println(advent9("/advent_9/main.test"))
}

/**
 *
 */
fun advent9(inputFilePath: String): Int {
    val inputStream = StringUtils.getResourceFileAsStream(inputFilePath)
    val scanner = Scanner(inputStream)

    val batteries = List(scanner.nextInt()) { scanner.nextInt() }
    val remainingBatteries = batteries.toMutableSet()

    var maxChainLength = 0
    for (i in batteries.indices) {
        if (i !in remainingBatteries) continue

        val batteriesChain = mutableSetOf(i + 1)
        var p = batteries[i]
        while (p !in batteriesChain) {
            batteriesChain.add(p)
            p = batteries[p - 1]
        }
        remainingBatteries.removeAll(batteriesChain)

        if (maxChainLength < batteriesChain.size) {
            maxChainLength = batteriesChain.size
        }
    }

    return maxChainLength
}