package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils

fun main() {
    println(advent8("/advent_8/main.test"))
}

/**
 * Я нашел на обратной стороне бумажку: там последовательность кнопок-нажатий,
 * но не сказано, в какой момент нужно завершать каждый символ.
 * Если ты не помнишь, как работают кнопочные пульты:
 * при многократном нажатии на кнопку символ переключается на следующий.
 * 2 -> A, 22 -> B, 222 -> C. Символа, соответствующего нажатиям 2222, нет,
 * это уже будет несколько символов подряд (например 22 + 22 -> BB, или 2 + 222 -> AC).
 *
 * Думаю, что последовательность 222 может означать как строку AAA, так и строку C.
 * Я точно знаю, что код — это самая короткая строка, которая подходит под последовательность нажатий,
 * а среди самых коротких — самая лексикографически минимальная
 * (например, строка AC лексикографически меньше строки CA, потому что в словаре она встретится раньше).
 */
fun advent8(inputFilePath: String): String {
    val inputString = StringUtils.getResourceFileAsStream(inputFilePath).bufferedReader().readLine()

    return inputString
        .replace(Regex("2222"), "AC")
        .replace(Regex("22"), "B")
        .replace(Regex("2"), "A")
        .replace(Regex("33333"), "EF")
        .replace(Regex("33"), "E")
        .replace(Regex("3"), "D")
        .replace(Regex("44444"), "HI")
        .replace(Regex("44"), "H")
        .replace(Regex("4"), "G")
        .replace(Regex("5555"), "JL")
        .replace(Regex("555"), "L")
        .replace(Regex("55"), "K")
        .replace(Regex("5"), "J")
        .replace(Regex("66"), "N")
        .replace(Regex("6"), "M")
        .replace(Regex("77"), "Q")
        .replace(Regex("7"), "P")
        .replace(Regex("88"), "U")
        .replace(Regex("8"), "T")
        .replace(Regex("99"), "X")
        .replace(Regex("9"), "W")
}