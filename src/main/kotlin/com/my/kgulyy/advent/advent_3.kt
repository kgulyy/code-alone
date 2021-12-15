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
    var isDone = false

    while (!isDone) {
        for (i in ropes) {
            stack.push(i)
            if (stack.sum() == height) {
                isDone = true
                break
            }
            if (stack.sum() > height) {
                stack.pop()
            }
        }

        if (!isDone) {
            ropes.removeFirst()
            stack.clear()
        }
    }

    println(stack)
    return stack.count() - 1
}

