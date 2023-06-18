package com.example.Kotlin_Practice

import java.io.File

class FileIO {

        //file I/O
        //kotlin does not have its own IO classes
        //default char set: UTF-8
        //if using another char set, specify char set as a parameter
        //user is responsible for closing the stream

    fun ex1(){
        val lines = File("testFile.txt").reader().readLines() // read each string
        lines.forEach{ println(it) } // do not use this function for huge files
    }

    fun ex2(){
        val reader = File("testFile.txt").reader()
        val oneString = reader.readText() // read all file to one string
        println(oneString)
        reader.close()
    }

    fun ex3(){
        //use
        //executes the given block on this resource
        //closes it down correctly whether an exception is thrown or not
        val lines = File("testFile.txt").reader().use{ it.readText() }
        println(lines)
    }

    fun ex4(){
        //it doesn't tell the user to close the file, it closes the file for user automatically
        //it has an internal limitation of two gigabytes
        val lines = File("testFile.txt").readText()
        println(lines)
    }

    fun ex5(){
        //if just using useLines(), user can see that have a sequence
        //so when actually get lines in file, use the terminal operation
        File("testFile.txt").reader().useLines{ it.forEach { println(it) } }
    }
}