package com.example.myfirstproject

fun main(args: Array<String>) {
    println("----------------------Immutable-----------------------------")
    // immutable
    var age = mapOf<String, Int>("david" to 39, "ronaldo" to 40, "messi" to 37)

    println("Age of David : " + age["david"])
    println("Age of Ronaldo : " + age["ronaldo"])
    println("Age of Messi : " + age["messi"])


    println("----------------------Mutable-----------------------------")
    // mutable
    var mutableAge = mutableMapOf<String, Int>("david" to 39, "ronaldo" to 40, "messi" to 37)
    mutableAge.put("naman", 23)
    println("Age of David : " + mutableAge["david"])
    println("Age of Ronaldo : " + mutableAge["ronaldo"])
    println("Age of Messi : " + mutableAge["messi"])
    println("Age of Naman : " + mutableAge["naman"])

}