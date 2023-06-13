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
}