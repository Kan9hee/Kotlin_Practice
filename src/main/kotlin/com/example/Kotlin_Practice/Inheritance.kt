package com.example.Kotlin_Practice

class Inheritance {
    fun inheritanceExam(){
        val laserPrinter = LaserPrinter("Laser",15)
        laserPrinter.printModel()


    }

    //class inheritance
    //use the open and abstract keywords in the parent class
    private abstract class Printer(val modelName: String){
        open fun printModel() = println("The model name of this printer is $modelName")
        abstract fun bestSellingPrice(): Double
    }

    private open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName){
        //function override
        final override fun printModel() = println("The model name of this laser printer is $modelName")
        override fun bestSellingPrice(): Double = 45.2
    }

    private class SpecialLaserPrinter:LaserPrinter{
        //child constructor
        constructor(modelName: String, ppm: Int): super(modelName,ppm)
    }

    //modifier data is incompatible with open

    //interface
    //it can have properties, don't have to be abstract
    private interface MyInterface{
        val number:Int //abstract
        //val failNumber: Int = 50
        val number2:Int
            get() = number*100 //concrete property
        //get property in an interface cannot have a backing field
        fun myFunction(str: String):String
    }

    private interface MySubInterFace:MyInterface{
        fun mySubFunction(num: Int):Int
    }

    private class Something:MySubInterFace{
        override val number: Int = 25 //defined
        override fun myFunction(str: String): String {
            TODO("Not yet implemented")
        }

        override fun mySubFunction(num: Int): Int {
            TODO("Not yet implemented")
        }
    }
}