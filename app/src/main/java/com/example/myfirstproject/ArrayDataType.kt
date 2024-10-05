package com.example.myfirstproject

fun main(args: Array<String>) {
    var cars = arrayOf("Mercedes", "BMW", "ferreri")
    println(cars.joinToString())
    cars+="Ford"
    println(cars.joinToString())
    cars.forEach { println(it) }

    var person = arrayOf(arrayOf("Naman", "Sharma"), arrayOf("Chanchal","Sharma"))
    for (per in person) {
        for(i in per) {
            print(i)
        }
        println()
    }

}