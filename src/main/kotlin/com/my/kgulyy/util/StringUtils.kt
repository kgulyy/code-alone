package com.my.kgulyy.util

class StringUtils {
    companion object {
        fun getResourceFileAsStream(fileName: String) = this::class.java.getResourceAsStream(fileName)!!
    }
}