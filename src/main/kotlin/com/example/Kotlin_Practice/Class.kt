package com.example.Kotlin_Practice

class Class {

    /*Access Modifier
    private - Java: Can't be used
              Kotlin: Visible Within the same file
    protected - Java: Can't be used
                Kotlin: Can't be used
    public - Java: Visible everywhere
             Kotlin: Visible everywhere
    internal - Java: Not exist
               Kotlin: Visible within the same module
                       Classes can't see private members belonging to inner classes
    */

    fun classExam(){

        val peo = People("John")
        println(peo.firstName)
        peo.fullTime = false
        println(peo.fullTime)

        val peo2 = People("Joe", false)
        println(peo2.firstName)
        println(peo2.fullTime)

    }

    private class People (val firstName: String, fullTime: Boolean = true){

        //val firstName: String = firstName
        /*
        init{
            this.firstName = firstName
        }   initialize block, not constructor
        */

        //Without the need for the above process, it can be processed in parameters
        //actually, we don't need the constructor keyword
        //but if change the visibility of the constructor, explicitly include constructor keyword

        /*
        constructor(firstName: String, fullTime: Boolean): this(firstName){
            this.fullTime = fullTime
        }   secondary constructor
        */

        //Kotlin generate default setter and getter
        //If property is private, setter and getter also going to be private
        var fullTime = fullTime
            get(){
                println("Running the custom get")
                return field
            }// custom get
            set(value){
                println("Running the custom set")
                field = value
            }
        //must declare get and set right after the property
    }
}