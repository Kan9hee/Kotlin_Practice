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
}