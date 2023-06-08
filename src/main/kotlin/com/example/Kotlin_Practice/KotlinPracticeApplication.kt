package com.example.Kotlin_Practice

fun main(args: Array<String>) {
	println(Object.getTagLine())
	println(Object.getCopyrightLine())
	println(SomeClass.accessPrivateVar())

	val someClass1 = SomeClass.justAssign("this is the string as is")
	val someClass2 = SomeClass.upperOrLower("this is the string as is",false)
	println(someClass1.someString)
	println(someClass2.someString)

	var thisIsMutable = 45

	wantsSomeInterface(object: SomeInterface {
		override fun mustImplement(num: Int): String{
			thisIsMutable++
			return "This is from mustImplement : ${num*100}" //2200
		}
	})

	println(thisIsMutable)
}