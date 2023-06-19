package com.example.Kotlin_Practice

import com.example.Kotlin_Practice.javacode.JavaCar

class Interoperability {

    fun nullabilityExam(){
        //nullability
        //kotlin protect against null pointer exceptions
        //java doesn't have any builtin protection

        val car = JavaCar("blue","Hyundai",2016)
        car.color = null
        println(car.toString())

        //if declare variable with not nullable types, can protect against null pointer exceptions
        //if declare variable as a nullable type, that is exclusively kotlin type, so can't use java class property
        var model:String? = car.model
        //println(model.javaClass) -> class java.lang.String
        model=null
        println(model)//null
    }

    fun callJavaExtend(){
        val car = JavaCar("black","Ford",2020)
        car.variableMethod(5,"hello","goodbye")

        val strings = arrayOf("hello","goodbye")
        car.variableMethod(5,*strings) //spread operator: unpack array

        car.needIntArray(intArrayOf(1,2,3)) //kotlin can't pass big array class
                                            //so pass one of the special primitive type array

        //(car.anObject as java.lang.Object).notify()

        //kotlin don't declare stuff is static
        //static method and field are convert companion objects
        println("x=${JavaCar.x}") //4
        println(JavaCar.xString()) //

        car.method({println("java thread call kotlin")})
    }

}