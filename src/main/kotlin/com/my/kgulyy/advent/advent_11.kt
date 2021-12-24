package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils
import java.util.*

fun main() {
    println(advent11("/advent_11/smoke.test"))
}

/**
 *
 */
fun advent11(inputFilePath: String): String {
    val inputStream = StringUtils.getResourceFileAsStream(inputFilePath)
    val scanner = Scanner(inputStream)

    val n = scanner.nextInt()
    val matrix = Array(n) { IntArray(scanner.nextInt()) { scanner.nextInt() } }

    val setOfAvailableIndexes = List(n) { it }.toMutableSet()
    var indexOfNextEmptyArray = findNextIndexOfEmptyArray(matrix, -1)

    val resultSequence = mutableListOf(indexOfNextEmptyArray + 1)
    setOfAvailableIndexes.remove(indexOfNextEmptyArray)
    indexOfNextEmptyArray = findNextIndexOfEmptyArray(matrix, indexOfNextEmptyArray)

    while (setOfAvailableIndexes.isNotEmpty()) {

        val list = matrix.withIndex()
            .filter { it.index < indexOfNextEmptyArray }
            .filter { it.index in setOfAvailableIndexes }

        var flag = false
        for (i in list) {
            if (canBeInclude(i.value, resultSequence)) {
                resultSequence.add(i.index + 1)
                setOfAvailableIndexes.remove(i.index)
                flag = true
                break
            }
        }

        if (!flag) {
            resultSequence.add(indexOfNextEmptyArray)
            indexOfNextEmptyArray = findNextIndexOfEmptyArray(matrix, indexOfNextEmptyArray)
        }
    }

    return resultSequence.toString()
}

fun findNextIndexOfEmptyArray(matrix: Array<IntArray>, prevIndex: Int) =
    matrix.withIndex().indexOfFirst { it.value.isEmpty() && it.index > prevIndex }

fun canBeInclude(array: IntArray, sequence: List<Int>) = sequence.containsAll(array.toList())