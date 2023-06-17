package com.example.Kotlin_Practice

import java.lang.StringBuilder

class Generic {
    fun genericExam(){
        //in kotlin, use a generic type when with collections
        val list = mutableListOf("Hello")
        list.add("bye")
        list.printCollection()
        list[0].uppercase()

        val bdList = mutableListOf(-33.45,31.42,55.66)
        bdList.printCollection()

        val ints = listOf(1,2,3,4,5)
        val shorts:List<Short> = listOf(10,20,30,40)
        convertToInt(ints)
        convertToInt(shorts)

        append(StringBuilder("ex1"),StringBuilder("ex2"))

        if(list is List<String>){ println("this list contains strings") }

        var listAny:Any = listOf("str1","str2")
        //if(listAny is List<String>) -> error. it can't guarantee anything, so it can't check this at runtime
        //listAny = listOf(1,2,3) -> java.lang.Integer cannot be cast to java.lang.String
        //                        => unchecked cast
        if(listAny is List<*>){
            println("list check to use star projection")
            val strList = listAny as List<String>
            println(strList[1].replace("str","string"))
        }

        val mixedList:List<Any> = listOf("1",2,3.3,'4')
        val onlyDoubles=getElementsOfType<Double>(mixedList)
        for(i in onlyDoubles){
            println(i) //3.3
        }

        val shortList:MutableList<Short> = mutableListOf(1,2,3,4)
        //mutableConvertToInt(shortList)


        val flowerTender = object:FlowerCare<Flower>{
            override fun prune(flower: Flower) { println("tending ${flower.name}") }
        }
        val roseGarden = Garden2<Rose>(listOf(Rose(), Rose()),flowerTender)
        roseGarden.tendFlower(0)
        val violetGarden = Garden2<Violet>(listOf(Violet(), Violet()),flowerTender)
        violetGarden.tendFlower(1)
    }

    //accept any type of list
    //can make it an extension function for a list of T
    fun <T> List<T>.printCollection(){
        for(i in this){ println(i) }
    }

    //restrict the generic type to the number class
    //number class is the parent class for all of the numeric types
    fun <T: Number> convertToInt(collection: List<T>){
        for(num in collection){
            println("${num.toInt()}")
        }
    }

    //where clause
    //set constraints on parameter types
    fun <T> append(item1:T,item2:T)
    where T:CharSequence, T:Appendable{
        println("result: ${item1.append(item2)}")
    }

    //reification
    //prevents type from being erased at runtime
    //in this case, function must be inlined
    inline fun <reified T> getElementsOfType(list:List<Any>): List<T>{

        var newList: MutableList<T> = mutableListOf()
        for(element in list){
            if(element is T){ newList.add(element) }
        }

        return newList
    }

    //covariance
    //use when such subtypes are preserved so that instances of the type or subtype can be passed
    //use 'out'
    //collections interface is covariant, but mutable collection isn't
    fun mutableConvertToInt(collection: MutableList<Number>){
        for(num in collection){ println("${num.toInt()}") }
        //collection.add(25.3) -> this problem can happen if there are no restrictions on covariant classes
    }

    //when declaring something as covariant, the ability to write to an instance and modify it is lost
    //also to ensure that writing to it is not possible, member functions are prohibited
    //from accepting a parameter of type T
    fun tendGarden(roseGarden:Garden<Rose>){
        waterGarden(roseGarden)
    }
    fun waterGarden(garden:Garden<Flower>){}
    open class Flower(val name:String){}
    class Rose:Flower("Rose")
    class Garden<out T:Flower>(val something: T){
        val flowers:List<T> = listOf()
        fun pickFlower(i:Int):T=flowers[i]
        //fun plantFlower(flower:T){}
    } //->covariant, but only use T in the out position

    //contravariance
    //opposite of covariance, accepts only current class, and its superclasses.
    //it's not ok to treat superclass like current class, so accept contravariant types as parameters
    //use 'in'
    interface FlowerCare<in T>{
        fun prune(flower: T)
    }
    class Violet:Flower("Violet")
    class Garden2<T:Flower>(val flowers:List<T>,val flowerCare:FlowerCare<T>){
        fun pickFlower(i:Int)=flowers[i]
        fun tendFlower(i:Int){ flowerCare.prune(flowers[i]) }
    }
}