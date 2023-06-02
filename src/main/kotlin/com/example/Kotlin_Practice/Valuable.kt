package com.example.Kotlin_Practice

typealias PeopleSet = Set<Valuable.Exam>

class Valuable {
    fun intro() {

        //create valuable
        val declarationNumber1 = 25
        val declarationNumber2: Int

        val people: PeopleSet

        val people1 = Exam("Kim",4885)
        people1.name = "Lee"

        val people2: Exam
        val number2 = 100

        //basic if
        //if (declarationNumber1<number2){
        //	people2 = Exam("Han",4007)
        //}else{
        //	people2 = Exam("Joe",1234)
        //}

        //kotlin's new if
        people2 = if (declarationNumber1<number2){
            Exam("Han",4007)
        }else{
            Exam("Joe",1234)
        }

        //auto catch mismatch
        //number = "hello"

        //kotlin StringBuilder, but actually using java.lang.StringBuilder
        //StringBuilder

        println(people1)
        //before = com.example.Kotlin_Practice.Exam@65b3120a
        //after = People(name=Lee, id=4885)

        val change = 4.22
        println("To show the value of change, we use $change") //insert value into string

        val numerator = 10.99
        val denominator = 20.00
        println("The value of $numerator divided by $denominator is ${numerator/denominator}")

        println("His id is ${people1.id}")

        val filePath = """c:\somedir\somewhere""" //triple quoted string
        //don't escape backslash

        val nationalAnthem = """동해 물과 백두산이 마르고 닳도록
							|하느님이 보우하사 우리나라 만세
							|무궁화 삼천리 화려 강산
							|대한 사람 대한으로 길이 보전하세""".trimMargin() //string line alignment
        println(nationalAnthem)
    }


    //create class
    class Exam(var name: String, val id: Int){
        override fun toString(): String {
            return "People(name=$name, id=$id)" //insert parameter into string
        }
    }
}