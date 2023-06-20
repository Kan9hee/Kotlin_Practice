package com.example.Kotlin_Practice.javacode;

import com.example.Kotlin_Practice.KotlinCar;
import com.example.Kotlin_Practice.StaticKotlin;

public class JavaKotlinCall {

    public static void kotlinCall(){
        //call kotlin class from java
        //kotlin extension include in class name

        //ReverseCallKt.topLevel();

        //calling compiler can use the JVM name to rename static classes to be generated
        StaticKotlin.topLevel();

        StaticKotlin.print("print this java string");
        KotlinCar car=new KotlinCar("white","BMW",2011,true);
        System.out.println(car.model);
        System.out.println(car.isAutomatic()); //when dealing with boolean, call get, not getter named get
    }
}
