package com.example.Kotlin_Practice

class Function {

    fun funExam(){
        println(labelMultiply(3,4,"The result is: "))
        println(labelMultiply(3,4))
        println(labelMultiply(label = "other location string - ", operand2 = 3, operand1 = 4))

        val stu = student("Kim")
        println(stu.upperCaseName())

        val cloth1=uniform("blue","male",2)
        val cloth2=uniform("green","female",1)
        printColorsWithString("Color: ",cloth1,cloth2)

        val clothArray = arrayOf(cloth1,cloth2) //array
        printColors(*clothArray)

        val clothArray2 = arrayOf(cloth2)
        val cloth3 = cloth1.copy()
        val combineClothArray = arrayOf(*clothArray,*clothArray2,cloth3)
        for(i in combineClothArray){
            println(i)
        }

        val s = "this is all in lowercase"
        println(s.upperFirstAndLast())
    }

    //simplified function
    fun labelMultiply(operand1: Int, operand2: Int,
                      label: String = "The answer is: "): String =
        "$label ${operand1 * operand2}"

    //inline function
    //Converts the lambda expression to bytecode corresponding to the body of the function
    inline fun inlineMultiply(operand1: Int, operand2: Int,
                      label: String = "The answer is: "): String =
        "$label ${operand1 * operand2}"

    fun simplerMultiply() = 3 * 4

    //vararg
    //when calling a function, allow specifying the number of arguments dynamically
    fun printColors(vararg clothing:uniform){
        for (uniform in clothing){
            println(uniform.color)
        }
    }

    fun printColorsWithString(str:String, vararg clothing:uniform){
        for (uniform in clothing){
            println(uniform.color)
        }
    }

    //extension function
    //add function to String class
    fun String.upperFirstAndLast():String{
        val upperFirst = substring(0,1).uppercase() + substring(1)
        return upperFirst.substring(0,upperFirst.length-1) +
                upperFirst.substring(upperFirst.length-1,upperFirst.length).uppercase()
    }

    class student(val name:String){
        fun upperCaseName() = name.uppercase()
    }

    data class uniform(val color: String, val gender: String, val grade: Int){}
}