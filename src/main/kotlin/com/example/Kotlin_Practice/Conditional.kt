package com.example.Kotlin_Practice

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

class Conditional {

    enum class TestEnum{
        TEST1,TEST2,TEST3
    }

    fun conditionalExam(){

        //If expression
        //must provide both an if and an else, must have a value,and require both branches.
        //above rules are followed only when returning a result to a variable
        //otherwise it can just use an if statement only
        var boolExam = 50 > 36
        val num = if(boolExam) 50 else 51

        println(if(boolExam){
            println("return 50")
            50 //last line return value
        }else{
            println("return 51")
            51
        })

        //when expression
        val v = 10
        when(num){
            50->println("50")
            v+41->println("51")
            52,53->println("52~53") //multi value
            in 100..122-> println("100~122") //multi value
            else->println("doesn't match")
            //no use break
        }

        val obj= arrayOf("String",3.14,432)
        val some:Any=obj[0]
        when(some){
            is String->{
                println("String")
                1
            }
            is Double->{
                println("Double")
                2
            }
            is Int->{
                println("Integer")
                3
            }
        }

        //enum when
        //one expression should be exhaustive in all branch where it is needed
        val test=TestEnum.TEST2
        val result = when(test){
            TestEnum.TEST1->"result 1"
            TestEnum.TEST2->"result 2"
            TestEnum.TEST3->"result 3"
        }

        //comparison when
        when{
            num>v->println("num is bigger than v")
            num<v->println("v is bigger than num")
            else->println("num = v")
        }

        println(getNum("23.8") ?: "wrong value")
        notImplementedYet("some") //exception
    }

    //try/catch
    //when catch exception, activate finally first, than activate catch
    fun getNum(str:String):Int?{
        return try{
            Integer.parseInt(str)
        }catch (e:NumberFormatException){
            null
        }finally {
            println("final block")
            0
        }
    }

    //function will never return anything, set type Nothing
    fun notImplementedYet(some:String):Nothing{
        throw IllegalArgumentException("implement me")
    }
}