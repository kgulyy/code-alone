package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils
import java.util.*

fun main() {
    println(advent7("/advent_7/main.test"))
}

/**
 * Смотри, тут на каждой баночке с клеем написаны номера нескольких баночек,
 * которые будут более липкими, чем имеющаяся. Надо найти баночку с самым липким содержимым.
 * Можешь посчитать сумму номеров баночек, которые надо проверить?
 *
 * Тут всего 50000 баночек, вот файл со всеми данными.
 * В строках после первой (таких строк будет ровно 50000) будет написано сначала
 * количество банок в строке (обозначим за m), а затем m чисел через пробел.
 * Каждое из чисел k в i-й строке означает, что банка с номером i менее липкая, чем банка с номером k.
 */
fun advent7(inputFilePath: String): Int {
    val inputStream = StringUtils.getResourceFileAsStream(inputFilePath)
    val scanner = Scanner(inputStream)

    val n = scanner.nextInt()
    val matrix = Array(n) { IntArray(scanner.nextInt()) { scanner.nextInt() } }

    return matrix.withIndex().filter { it.value.isEmpty() }.sumOf { it.index + 1 }
}