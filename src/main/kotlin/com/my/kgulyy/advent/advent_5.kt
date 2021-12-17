package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils

fun main() {
    println(advent5("/advent_5/smoke.test"))
}

fun advent5(inputFilePath: String): String {
    val fileLines = StringUtils.getResourceFileAsStream(inputFilePath).bufferedReader().readLines()

    val firstLine = fileLines[0].split(' ').map { it.toInt() }
    val n = firstLine[0]
    val k = firstLine[1]

    val matrix = mutableListOf<List<Int>>()
    for (i in 1..n) {
        val list = fileLines[i].split(' ').map { it.toInt() }
        matrix.add(list)
    }

    return ""
}
