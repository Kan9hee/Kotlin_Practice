package com.example.Kotlin_Practice

class Collection {
    fun listExam(){
        //kotlin list
        //it's important to note that since kotlin is enforcing immutability using interface definitions
        //if pass an instance of an immutable collection to Java code the immutable characteristic is off the table
        //in this case, nothing will stop the Java code from modifying the collection
        val strings =listOf("exam1","exam2","exam3")
        println(strings.javaClass) //class java.util.Arrays$ArrayList

        //when dealing with immutable variables, use an empty list
        val emptyList = emptyList<String>()
        println(emptyList.javaClass) //class kotlin.collections.EmptyList

        //list that doesn't contain nulls
        val notNullList = listOfNotNull("notnull",null)
        println(notNullList) //[notnull]

        //list is read-only, but mutableList is both readable and writable
        val mutableList = mutableListOf<Int>(2,4,6,8)
        println(mutableList.javaClass) //class java.util.ArrayList
        mutableList.add(2,5) //2,4,5,6,8
        mutableList.remove(6) //2,4,5,8
        println(mutableList)

        //change array to list style
        val arrayToList = arrayOf("ex1","ex2","ex3").toList()
        println(arrayToList)
    }

    fun colFunc(){
        val strings = listOf("string","other","and another")
        val colorList = listOf("red","blue","white")
        val nums = listOf(1,2,3,4,5)
        println(strings.last()) //and another
        println(strings.asReversed()) //and another, other, string
        println(strings.getOrNull(5)) //print element 5, if activate exception, return null
        println(nums.max()) //5
        println(colorList.zip(strings)) //[(red, string), (blue, other), (white, and another)]

        val mergedLists = listOf(colorList,strings)
        println(mergedLists) //[[red, blue, white], [string, other, and another]]
        val combineList = strings + colorList
        println(combineList) //[string, other, and another, red, blue, white]

        val duplicatedColorList = listOf("red","blue","white","blue","red")
        val noDupList = duplicatedColorList.union(strings) //doesn't have any duplicate element
        println(noDupList) //[red, blue, white, string, other, and another]
        println(duplicatedColorList.distinct()) //remove all the duplicate elements
        val mutableNums = nums.toMutableList() //change immutable list
        mutableNums.add(99)
        println(mutableNums)
    }

    fun mapExam(){
        val immutableMap = mapOf<Int,Car>(
            1 to Car("Black",2020),
            2 to Car("Blue",2021))
        println(immutableMap.javaClass) //class java.util.LikedHashMap
        println(immutableMap)

        val mutableMap = mutableMapOf<String,Car>(
            "car 1" to Car("Red",2019),
            "car 2" to Car("Green",2010))
        println(mutableMap.javaClass) //class java.util.HashMap
        mutableMap.put("My car",Car("White",2023))
        println(mutableMap)

        val pair = Pair(10,"ten")
        val(firstValue,secondValue) = pair //destructuring declaration
        println(firstValue) //10
        println(secondValue) //ten

        for((key,value) in mutableMap){
            println("$key -> $value")
        }

        val (color,year) = Car("Yellow",1988)
        println("color is $color, year is $year")
    }

    fun setExam(){
        //set
        //that change does not affect the original
        val setInts = setOf(10,15,19,5,3)
        println(setInts.plus(29))
        println(setInts.minus(19))
        println(setInts.average())
        println(setInts.drop(3)) //5 3

        val mutableInts= mutableSetOf(1,2,3,4,5)
        mutableInts.plus(10) //it also, does not change original
        println(mutableInts)
    }

    fun colFuncEx(){
        //filter
        //get it items based on a predicate expressed as a lambda
        //remove elements you don't want in the collection
        //but the elements themselves don't change
        val nums = listOf(1,2,3,4,5)
        val immutableMap = mapOf<Int,Car>(
            1 to Car("Black",2020),
            2 to Car("Blue",2021)
        )
        val mutableMap = mutableMapOf(
            1 to Car("Red",2019),
            2 to Car("Green",2010)
        )

        println(nums.filter { it % 2 != 0 })
        println(immutableMap.filter { it.value.year == 2019 })
        mutableMap.filter { it.value.color == "Red" }
        println(mutableMap)

        val add10List = nums.map{it+10} //return collection
        println(add10List) //class java.util.ArrayList

        println(immutableMap.map { it.value.year }) //2020,2021
        println(immutableMap.filter{it.value.color=="Red"}
            .map { it.value.year })
        println(immutableMap.any{it.value.year<2014}) //false
        println(immutableMap.count{it.value.year<2014}) //0

        val cars = immutableMap.values
        println(cars.find{it.year>2020}) //find blue car
        println(cars.groupBy { it.color }) //make group same color element
        println(immutableMap.toSortedMap()) //sorted by key value
        println(cars.sortedBy { it.year }) //sorted by year value
    }

    fun sequenceExam(){
        //sequence
        //pretty same as streams in java
        //instead of each step in the chain evaluating the entire collection at once
        //and then returning and passing that collection
        //avoid the creation of intermediate instances
        val immutableMap = mapOf<Int,Car>(
            1 to Car("Black",2020),
            2 to Car("Blue",2021),
            3 to Car("Red",2019),
            4 to Car("Black",2010)
        )

        println(immutableMap.asSequence().filter { it.value.year>2020 })
        listOf("ex1","ex2","ex3").asSequence() //if no use sequence, search all element
            .map { println("mapping $it"); it.uppercase() }
            .filter { println("filtering $it"); it[0]=='E' }
            .find{ it.endsWith('1') } //if find element, terminates chain
    }

    data class Car(val color:String,val year:Int){

    }
}