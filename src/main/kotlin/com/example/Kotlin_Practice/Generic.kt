package com.example.Kotlin_Practice

import java.lang.StringBuilder

class Generic {
    fun genericExam(){
        //in kotlin, use a generic type when with collections
        val list = mutableListOf("Hello")
        list.add("bye")
        list.printCollection()
        list[0].uppercase()

        val bdList = mutableListOf(-33.45,31.42,55.66)
        bdList.printCollection()

        val ints = listOf(1,2,3,4,5)
        val shorts:List<Short> = listOf(10,20,30,40)
        convertToInt(ints)
        convertToInt(shorts)

        append(StringBuilder("ex1"),StringBuilder("ex2"))

        if(list is List<String>){ println("this list contains strings") }

        var listAny:Any = listOf("str1","str2")
        //if(listAny is List<String>) -> error. it can't guarantee anything, so it can't check this at runtime
        //listAny = listOf(1,2,3) -> java.lang.Integer cannot be cast to java.lang.String
        //                        => unchecked cast
        if(listAny is List<*>){
            println("list check to use star projection")
            val strList = listAny as List<String>
            println(strList[1].replace("str","string"))
        }
    }

    //accept any type of list
    //can make it an extension function for a list of T
    fun <T> List<T>.printCollection(){
        for(i in this){ println(i) }
    }

    //restrict the generic type to the number class
    //number class is the parent class for all of the numeric types
    fun <T: Number> convertToInt(collection: List<T>){
        for(num in collection){
            println("${num.toInt()}")
        }
    }

    //where clause
    //set constraints on parameter types
    fun <T> append(item1:T,item2:T)
    where T:CharSequence, T:Appendable{
        println("result: ${item1.append(item2)}")
    }
}