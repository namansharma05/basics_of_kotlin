package com.example.myfirstproject

fun main(args: Array<String>) {
//    print("what is you name? ")
//    var name:String? = readLine()
//    print("How old are you?")
//    var age:Int? = readLine()!!.toInt()
//
//    println("your name is $name and your age is $age. Am i correct?")
//    var isCorrect: Boolean? = readLine()!!.toBoolean()
//
//    if(isCorrect!!) {
//        println("Yay!")
//    } else {
//        println("lets do it another time")
//    }


    // for loop
//    var array = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//    for (i in array.indices) {
//        println("Number at index $i : ${array[i]} ")
//    }
//
//    // for each loop
//    var newArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//    var sum = 0
//    newArray.forEach {
//        sum += it
//    }
//    println("Sum of elements of newArray : $sum")
//
//    // while loop
//    var k = 1
//    var fact = 1
//    while(k<6) {
//        fact*=k
//        println("$k! : $fact")
//        k++
//    }


    // generate random number
//    for(i in 0..10) {
//    var randNumber = Random.nextInt(0,100)
//        println("generated random number : $randNumber")
//    }


    // number guesser game
//    var number = Random.nextInt(0,50)
//    while (true) {
//        print("Guess a number: ")
//        var guessedNumber = readLine()!!.toInt()
//
//        if(guessedNumber == number) {
//            println("Hey man you know the number in my mind!!")
//            break;
//        } else if(guessedNumber < number) {
//            println("Guess number greater than previous guessed number")
//        } else {
//            println("Guess number less than previous guessed number")
//        }
//    }

//    do-while loop
    var i = 1
    do {
        print("$i ")
        i++
    } while (i<10)
}