package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils
import java.util.*

fun main() {
    println(advent3("/advent_3/main.test"))
}

fun advent3(inputFilePath: String): Int {
    val inputStream = StringUtils.getResourceFileAsStream(inputFilePath)
    val scanner = Scanner(inputStream)

    val numberOfRopes = scanner.nextInt()
    val height = scanner.nextInt()
    val ropes = MutableList(numberOfRopes) { scanner.nextInt() }.sortedDescending().toMutableList()

    return countNodes(height, ropes)
}

fun countNodes(height: Int, ropes: MutableList<Int>): Int {
    val stack = Stack<Int>()

    var isDone = tie(stack, height, ropes)
    while (!isDone) {
        val lastItem = stack.pop()
        val lastIndexOfItem = ropes.lastIndexOf(lastItem)
        if (lastIndexOfItem == ropes.lastIndex) continue

        isDone = tie(stack, height, ropes.subList(lastIndexOfItem + 1, ropes.lastIndex + 1))
    }

    println(stack)
    return stack.count() - 1
}

fun tie(stack: Stack<Int>, height: Int, ropes: MutableList<Int>): Boolean {
    for (i in ropes) {
        stack.push(i)
        if (stack.sum() == height) return true
        if (stack.sum() > height) stack.pop()
    }
    return false
}

