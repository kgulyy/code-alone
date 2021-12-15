package com.my.kgulyy.advent

fun main() {
    println(advent2(945747, 130713))
}

fun advent2(windowWidth: Long = 4, rotatePoint: Long = 1): Long {
    val leftCircle = rotatePoint * 2
    val rightCircle = (windowWidth - rotatePoint) * 2

    return lcm(leftCircle, rightCircle)
}

fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)
fun lcm(a: Long, b: Long): Long = a / gcd(a, b) * b