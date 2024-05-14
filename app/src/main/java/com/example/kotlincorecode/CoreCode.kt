package com.example.kotlincorecode


public val TAG = "CoreCode"

class Book(var name: String) {
    fun printName() {
        println(this.name)
    }
}

fun main() {
    val book1 = Book("Kotlin Core Code")
    book1.name = "Kotlin code"
    book1.printName()
}