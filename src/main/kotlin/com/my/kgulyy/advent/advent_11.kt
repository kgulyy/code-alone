package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils
import java.util.*

fun main() {
    println(advent11("/advent_11/main.test"))
}

/**
 *
 */
fun advent11(inputFilePath: String): Int {
    val inputStream = StringUtils.getResourceFileAsStream(inputFilePath)
    val scanner = Scanner(inputStream)

    val n = scanner.nextInt()
    val matrix = Array(n) { IntArray(scanner.nextInt()) { scanner.nextInt() } }

    val setOfAvailableIndexes = List(n) { it }.toSortedSet()
    var indexOfNextEmptyArray = findNextIndexOfEmptyArray(matrix, -1)
    setOfAvailableIndexes.remove(indexOfNextEmptyArray)

    var resultSequence = mutableListOf(indexOfNextEmptyArray + 1)
    indexOfNextEmptyArray = findNextIndexOfEmptyArray(matrix, indexOfNextEmptyArray)



    return 0
}

fun findNextIndexOfEmptyArray(matrix: Array<IntArray>, prevIndex: Int) =
    matrix.withIndex().indexOfFirst { it.value.isEmpty() && it.index > prevIndex }