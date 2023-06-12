package com.example.Kotlin_Practice

class Lambda {
    fun lambdaExam(){
        //lambda
        //acts as a function even if it does not have a name
        //it helps to reduce code when writing functions that play simple roles

        //run{println("lambda")} -> lambda
        val users = listOf(User("kim","cheolsu",4),
            User("hong","gildong",6),
            User("park","jinyeong",7));


        //data types can be omitted where inference is possible.
        println(users.minBy(User::startMonth)) //find users with the lowest number of months

        var num=10 //compiler is only going to actually know about this variable
        // and generate this variable after the lambda
        run{
            num+=15
            println(num)
        }

        run(::topLevel) //call topLevel function like lambda using colon
    }

    fun topLevel() = println("function print")

    fun userParameter(users:List<User>,num:Int){
        users.forEach{
            println("${it.firstName}\n${num}")
        }
    }

    data class User(val firstName: String,val lastName:String,val startMonth:Int){

    }
}