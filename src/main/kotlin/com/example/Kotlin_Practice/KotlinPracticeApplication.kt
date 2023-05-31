package com.example.Kotlin_Practice

typealias PeopleSet = Set<Exam>

fun main(args: Array<String>) {

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
}

//create class
class Exam(var name: String, val id: Int){

}