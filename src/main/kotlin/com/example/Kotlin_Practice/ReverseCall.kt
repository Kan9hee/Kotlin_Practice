@file:JvmName("StaticKotlin")

package com.example.Kotlin_Practice

fun topLevel()=println("i'm in the kotlin file")

fun main(args:Array<String>){
    "Print this".print()
}

class ReverseCall(val str:String, val integer:Int) {
}

fun String.print(){ println(this) }