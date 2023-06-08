package com.example.Kotlin_Practice

import java.time.Year

object Object {

    //singleton
    //common design pattern in Java, like static
    //use when you want only one instance of a class during application execution
    //no constructor

    val currentYear = Year.now().value

    fun getTagLine() = "Our tag text"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear. All rights reserved"
}

class SomeClass private constructor(val someString: String){
    //companion
    //Kotlin know that you've got a companion object and there is a function called access private var
    companion object{
        private var privateVar=6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        //factory pattern - method
        //prevent anything from outside the class from using a constructor directly,
        //it has to go through one of the functions in the companion object
        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLower(str: String, lowercase: Boolean): SomeClass{
            if (lowercase){
                return SomeClass(str.lowercase())
            }else{
                return SomeClass(str.uppercase())
            }
        }
    }
}

//anonymous object
interface SomeInterface{
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface){
    //When implementing SomeInterface's mustImplement function, the value to be passed can be set here
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}