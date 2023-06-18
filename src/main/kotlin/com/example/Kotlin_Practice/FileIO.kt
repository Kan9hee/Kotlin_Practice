package com.example.Kotlin_Practice

import java.io.DataInputStream
import java.io.EOFException
import java.io.File
import java.io.FileInputStream

class FileIO {

        //file I/O
        //kotlin does not have its own IO classes
        //default char set: UTF-8
        //if using another char set, specify char set as a parameter
        //user is responsible for closing the stream

    fun ex1(){
        val lines = File("src/testFile.txt").reader().readLines() // read each string
        lines.forEach{ println(it) } // do not use this function for huge files
    }

    fun ex2(){
        val reader = File("src/testFile.txt").reader()
        val oneString = reader.readText() // read all file to one string
        println(oneString)
        reader.close()
    }

    fun ex3(){
        //use
        //executes the given block on this resource
        //closes it down correctly whether an exception is thrown or not
        val lines = File("src/testFile.txt").reader().use{ it.readText() }
        println(lines)
    }

    fun ex4(){
        //it doesn't tell the user to close the file, it closes the file for user automatically
        //it has an internal limitation of two gigabytes
        val lines = File("src/testFile.txt").readText()
        println(lines)
    }

    fun ex5(){
        //if just using useLines(), user can see that have a sequence
        //so when actually get lines in file, use the terminal operation
        File("src/testFile.txt").reader().useLines{ it.forEach { println(it) } }
    }

    fun binaryExam(){
        //binary file
        //also, kotlin does not have its own classes
        val ex = DataInputStream(FileInputStream("src/testFile.bin"))
        var si:String
        try{
            while(true){
                si = ex.readUTF()
                println(si)
            }
        }catch(e:EOFException){}

        //try(fr:FileReader = blabla) -> compiler doesn't have try with resources in the same way that java does
    }

    fun walkExam(){
        //walk
        //accepts a direction specifying whether to walk up or down a tree
        //walk up function walks up a file tree, then visit after their files
        //walk down function walks down a file tree, then visits directories before other files
        File(".").walkTopDown()
            .filter { it.name.endsWith(".kt") } //filtering kotlin file
            .forEach { println(it) }
    }
}