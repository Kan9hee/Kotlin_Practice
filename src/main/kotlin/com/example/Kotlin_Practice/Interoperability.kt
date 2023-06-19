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

}