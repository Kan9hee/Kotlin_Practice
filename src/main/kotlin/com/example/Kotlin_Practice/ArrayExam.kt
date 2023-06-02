package com.example.Kotlin_Practice

import java.math.BigDecimal

class ArrayExam {
    fun arrayExam(){
        val names = arrayOf("John","Jane","Jill","Joe")

        val longs1 = arrayOf(1L,2L,3L)
        val longs2 = arrayOf<Long>(1,2,3,4)

        val longs3 = arrayOf(1,2,3,4)

        println(longs1 is Array<Long>) //true
        println(longs2 is Array<Long>) //true
        println(longs3 is Array<Int>) //true

        println(longs1[2]) //Jill

        val evenNumbers = Array(16){i->i*2} //get 16 elements, multiple of 2
        for(number in evenNumbers){
            println(number)
        }

        val lotsOfNumbers = Array(100000){i->i+1}
        val allZeroes = Array(100){0}

        var someArray: Array<Int>
        someArray = arrayOf(1,2,3,4)
        for(number in someArray){
            println(number) //1 2 3 4
        }
        someArray = Array(6){i->(i+1)*10}
        for(number in someArray){
            println(number) //10 20 30 40 50 60
        }

        val mixedArray = arrayOf("Hello",22,BigDecimal(10.5),'a')
        for(element in mixedArray){
            println(element) //hello 22 10.5 a
        }
        println(mixedArray is Array<*>) //true

        val myIntArray = arrayOf(3,9,434,2,33.8)
        //JavaCheck().printNumbers(myIntArray) -> type mismatch, need special primitive array class
        val myIntArray2 = intArrayOf(3,9,434,2,33)
        JavaCheck().printNumbers(myIntArray2)

        //var someOtherArray = Array<Int>(5) -> no value passed for parameter init error
        var someOtherArray = IntArray(5) //initialization 0

        JavaCheck().printNumbers(evenNumbers.toIntArray())

        val convertedIntArray: Array<Int> = myIntArray2.toTypedArray()
    }
}