package com.example.Kotlin_Practice

class Imports {
    //internal
    //kotlin's package-specific access modifier
    //It can be used within the same module, but cannot be used in other modules
    internal fun packageCheck(){
        println("My package doesn't match")
    }
}