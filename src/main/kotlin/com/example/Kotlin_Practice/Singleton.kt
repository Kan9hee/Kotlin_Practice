package com.example.Kotlin_Practice

import java.time.Year

object Singleton {

    //common design pattern in Java, like static
    //use when you want only one instance of a class during application execution
    //no constructor

    val currentYear = Year.now().value

    fun getTagLine() = "Our tag text"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear. All rights reserved"
}