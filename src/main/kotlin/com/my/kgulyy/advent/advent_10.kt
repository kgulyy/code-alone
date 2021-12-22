package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils
import java.util.*
import kotlin.math.max

fun main() {
    println(advent10("/advent_10/main.test"))
}

/**
 *
 */
fun advent10(inputFilePath: String): Int {
    val inputStream = StringUtils.getResourceFileAsStream(inputFilePath)
    val scanner = Scanner(inputStream)

    val barLength = List(scanner.nextInt()) { scanner.nextInt() }

    return getMaxAreaOfHist(barLength)
}

fun getMaxAreaOfHist(hist: List<Int>): Int {
    val n = hist.size

    val stack = Stack<Int>()
    stack.push(-1)

    val leftSmaller = IntArray(n) { -1 }
    val rightSmaller = IntArray(n) { n }

    var i = 0
    while (i < n) {
        while (stack.isNotEmpty() && stack.peek() != -1 && hist[i] < hist[stack.peek()]) {
            rightSmaller[stack.peek()] = i
            stack.pop()
        }
        if (i > 0 && hist[i] == hist[i - 1]) {
            leftSmaller[i] = leftSmaller[i - 1]
        } else {
            leftSmaller[i] = stack.peek()
        }
        stack.push(i)
        i++
    }

    var maxArea = hist[0]
    for (j in 0 until n) {
        maxArea = max(maxArea, hist[j] * (rightSmaller[j] - leftSmaller[j] - 1))
    }

    return maxArea
}