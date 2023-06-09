package com.example.Kotlin_Practice.anotherPackage

import com.example.Kotlin_Practice.Function

//imports
//When importing a top-level function,
//proceed the same way as for classes,
//except that you can specify a function name and import individual functions
fun main(args:Array<String>){
    println(Function().labelMultiply(1,2))
}