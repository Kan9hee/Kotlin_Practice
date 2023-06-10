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

        //loop - for
        //kotlin's for loop declares differently than java's for loop
        for(i in range){ println(i) }

        val str="example"
        val sRange = 0..str.length
        for(c in str){ println(c) }
        for(num in 1..20 step 4){ println(num) }
        for(num in 20 downTo 1 step 2){ println(num) }
        for(i in 1 until 10){ println(i) } //1~9

        val seasons = arrayOf("spring","summer","fall","winter")
        for(index in seasons.indices){ println("${seasons[index]} is season number $index") }
        println("whatever" !in seasons)

        seasons.forEach{ println(it) } //lambda
        seasons.forEachIndexed{index,value -> println("$value is season number $index")}

        //loop naming
        for(i in 1..3){
            println("loop i")
            jloop@ for(j in 1..4){
                println("loop j")
                for(k in 5..10){
                    println("loop k")
                    if(k == 7) { break@jloop }
                }
            }
        }
    }
}