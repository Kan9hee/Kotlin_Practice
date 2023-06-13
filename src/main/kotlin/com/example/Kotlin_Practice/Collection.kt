package com.example.Kotlin_Practice

class Collection {
    fun listExam(){
        //kotlin list
        //it's important to note that since kotlin is enforcing immutability using interface definitions
        //if pass an instance of an immutable collection to Java code the immutable characteristic is off the table
        //in this case, nothing will stop the Java code from modifying the collection
        val strings =listOf("exam1","exam2","exam3")
        println(strings.javaClass) //class java.util.Arrays$ArrayList

        //when dealing with immutable variables, use an empty list
        val emptyList = emptyList<String>()
        println(emptyList.javaClass) //class kotlin.collections.EmptyList

        //list that doesn't contain nulls
        val notNullList = listOfNotNull("notnull",null)
        println(notNullList) //[notnull]

        //list is read-only, but mutableList is both readable and writable
        val mutableList = mutableListOf<Int>(2,4,6,8)
        println(mutableList.javaClass) //class java.util.ArrayList
        mutableList.add(2,5) //2,4,5,6,8
        mutableList.remove(6) //2,4,5,8
        println(mutableList)

        //change array to list style
        val arrayToList = arrayOf("ex1","ex2","ex3").toList()
        println(arrayToList)
    }

    fun colFunc(){
        val strings = listOf("string","other","and another")
        val colorList = listOf("red","blue","white")
        val nums = listOf(1,2,3,4,5)
        println(strings.last()) //and another
        println(strings.asReversed()) //and another, other, string
        println(strings.getOrNull(5)) //print element 5, if activate exception, return null
        println(nums.max()) //5
        println(colorList.zip(strings)) //[(red, string), (blue, other), (white, and another)]

        val mergedLists = listOf(colorList,strings)
        println(mergedLists) //[[red, blue, white], [string, other, and another]]
        val combineList = strings + colorList
        println(combineList) //[string, other, and another, red, blue, white]

        val duplicatedColorList = listOf("red","blue","white","blue","red")
        val noDupList = duplicatedColorList.union(strings) //doesn't have any duplicate element
        println(noDupList) //[red, blue, white, string, other, and another]
        println(duplicatedColorList.distinct()) //remove all the duplicate elements
        val mutableNums = nums.toMutableList() //change immutable list
        mutableNums.add(99)
        println(mutableNums)
    }

    fun mapExam(){
        val immutableMap = mapOf<Int,Car>(
            1 to Car("Black",2020),
            2 to Car("Blue",2021))
        println(immutableMap.javaClass) //class java.util.LikedHashMap
        println(immutableMap)

        val mutableMap = mutableMapOf<String,Car>(
            "car 1" to Car("Red",2019),
            "car 2" to Car("Green",2010))
        println(mutableMap.javaClass) //class java.util.HashMap
        mutableMap.put("My car",Car("White",2023))
        println(mutableMap)

        val pair = Pair(10,"ten")
        val(firstValue,secondValue) = pair //destructuring declaration
        println(firstValue) //10
        println(secondValue) //ten

        for((key,value) in mutableMap){
            println("$key -> $value")
        }

        val (color,year) = Car("Yellow",1988)
        println("color is $color, year is $year")
    }

    data class Car(val color:String,val year:Int){

    }
}