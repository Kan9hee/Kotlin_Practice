package com.example.Kotlin_Practice

class NullReferences{
    fun nullExam(){

        //val str: String = null
        val str: String? = null //nullable variable

        val examString: String? = "This isn't null"
        //examString.toUpperCase()
        if(examString != null){
            //examString.toUpperCase() -> deprecated
            examString.uppercase()
        }
        examString?.uppercase()

        println("What happens when we do this: ${str?.uppercase()}")
        println("What happens when we do this: ${examString?.uppercase()}")

        //can nest null checks
        //example: val countryCode: String? = bankBranch?.address?.country

        //Elvis operator
        val ex2= str ?: "This is default value" //if left value is null, then import right value
        println(ex2)

        val list: Any = arrayOf(1,2,3,4)
        val ex3 = list as? String //safe call
        println(ex3)

        val ex4 = str!!.uppercase() //guarantee not null
        str?.let{printText(it)} //let function: str isn't null operate printText()

        println(ex2 == ex4) //safe
    }

    fun printText(text: String){println(text)}
}