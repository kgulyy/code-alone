package com.my.kgulyy.advent

import com.my.kgulyy.util.StringUtils

fun main() {
    println(advent6("/advent_6/main.test"))
}

fun advent6(inputFilePath: String): String {
    val fileLine = StringUtils.getResourceFileAsStream(inputFilePath).bufferedReader().readLine()
    val listOfCommands = fileLine.toCharArray()

    val diffInDirectionDownAndUp = listOfCommands.count { it == 'D' } - listOfCommands.count { it == 'U' }
    val diffInDirectionLeftAndRight = listOfCommands.count { it == 'L' } - listOfCommands.count { it == 'R' }

    var result = ""

    if (diffInDirectionDownAndUp > 0) {
        result += "D".repeat(diffInDirectionDownAndUp)
    }

    result +=
        if (diffInDirectionLeftAndRight > 0) {
            "L".repeat(diffInDirectionLeftAndRight)
        } else {
            "R".repeat(-diffInDirectionLeftAndRight)
        }

    if (diffInDirectionDownAndUp < 0) {
        result += "U".repeat(-diffInDirectionDownAndUp)
    }

    return result
}
