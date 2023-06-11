package com.example.Kotlin_Practice

class Conditional {

    fun conditionalExam(){

        //If expression
        //must provide both an if and an else, must have a value,and require both branches.
        //above rules are followed only when returning a result to a variable
        //otherwise it can just use an if statement only
        var exam = 50 > 36
        val num = if(exam) 50 else 51

        println(if(exam){
            println("return 50")
            50 //last line return value
        }else{
            println("return 51")
            51
        })
    }
}