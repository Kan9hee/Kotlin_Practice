package com.example.Kotlin_Practice.anothermodulepackage

//add Kotlin_Practice.main module
import com.example.Kotlin_Practice.Function as kp

fun main(args:Array<String>){
    println("another module print")
    println(kp().labelMultiply(3,4))
}

// This is not a normal kotlin module.
// Until 2022, it could add modules using kotlin in intellij.
// but this has been disabled due to many issues.
// This is a similar implementation of the existing Kotlin module,
// and when actually executed, functions called from other modules do not execute properly.