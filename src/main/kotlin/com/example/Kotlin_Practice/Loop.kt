package com.example.Kotlin_Practice

class Loop{

    fun loopExam(){

        //number range value
        //two dots the start and end values are inclusive
        val range = 1..5 //1~5
        val charRange = 'a'..'z'
        val stringRange = "ABC".."XYZ"

        println(3 in range) //true
        println('q' in charRange) //true
        println("DEF" in stringRange) //true
        println("CCCCCC" in stringRange) //true, because it's less than XYZ (C<X)

        val backwardRange = 5.downTo(1) //reverse
        val r = 5..1 //can't reverse
        println(5 in backwardRange) //true
        println(5 in r) //false

        val stepRange = 3..15
        val stepThree = stepRange.step(3) //count by 3
        val reversedRange = stepRange.reversed() //reverse


    }
}