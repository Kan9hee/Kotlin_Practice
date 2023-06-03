package com.example.Kotlin_Practice

import com.example.Kotlin_Practice.javacode.JavaCheck

class DataTypes {
    fun exam(){
        val myInt = 10

        var myLong: Long = 22
        val myLong2 = 22L

        //myLong = myInt -> not change datatype automatically
        myLong = myInt.toLong()

        val myByte:Byte = 111
        var myShort: Short
        myShort = myByte.toShort()

        var myDouble = 65.987
        println(myDouble is Double) //print true, or false

        val myFloat = 838.123f
        println("This is a float: ${myFloat is Float}")
        myDouble = myFloat.toDouble()

        val char = 'b'
        val myCharInt = 65
        println(myCharInt.toChar()) //A

        val myBoolean = true
        println(JavaCheck().isWorkWithJava(myBoolean)) //working
        //when use java class in kotlin, call java class to method style
    }
}