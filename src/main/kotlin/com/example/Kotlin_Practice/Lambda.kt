package com.example.Kotlin_Practice

class Lambda {
    fun lambdaExam(){

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

        println(anotherCountTo100())

        findByLastName(users,"gildong") //print success case and fail case

        "exam String1".apply ex1@{
            "exam String2".apply {
                println(lowercase())
                println(this@ex1.uppercase())
            }
        }
    }

    fun topLevel() = println("function print")

    fun userParameter(users:List<User>,num:Int){
        users.forEach{
            println("${it.firstName}\n${num}")
        }
    }

    //count and build string
    fun countTo100():String{
        val numbers = StringBuilder()
        for(i in 1..10){
            numbers.append(i)
            numbers.append(",")
        }
        numbers.append("end")
        return numbers.toString()
    }

    //more concise than original to use lambda
    //other case, using with function
    fun anotherCountTo100() =
        StringBuilder().apply() {
            for (i in 1..10) {
                    append(i)
                    append(",")
                }
            append("end")
        }.toString()

    //when the lambda is inside the function, it's returning from the lambda and the function
    //beware of non-local returns
    //it can use local returns through symbol
    fun findByLastName(users:List<User>,lastName: String){
        users.forEach localBlock@{
            if(it.lastName == lastName){
                println("catch $lastName")
                return@localBlock //the return is now just returning from a lambda, not returning from the function
            }
        }
        println("catch fail to use $lastName")
    }

    data class User(val firstName: String,val lastName:String,val startMonth:Int){

    }
}