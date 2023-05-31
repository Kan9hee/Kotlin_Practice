package com.example.Kotlin_Practice

class DifferencesExam {

    fun exam(){
        //java

        //var number=10;
        //value = booleanCheck ? yes : no
        //for(int i=0;i<20;i++){}
        //People people1=new People("p1",1);
        //People people1=new People("p2",2);
        //People people1=new People("p3",3);
        //System.out.println(people1 == people2); -> false
        //System.out.println(people2 == people3); -> false
        //System.out.println(people1.equals(people2)); -> false
        //System.out.println(people2.equals(people3)); -> true

        //kotlin

        //omit the semicolon
        //soft keywords can be used in identifiers
        //but hard keywords are not possible
        var number2_k=10
        val names = arrayListOf("John","Jane","Mary")
        println(names[1])

        val people1=People("p1",1)
        val people2=People("p1",1)
        val people3=People("p1",1)

        println(people1 == people2) //false
        println(people2 == people3) //true
        //println(people1.equals(people2)) //false
        //println(people2.equals(people3)) //true

        //referential equality
        println(people1 === people2) //false
        println(people2 === people3) //false
        val people4=people2
        println(people4 === people2) //true

        //not equal
        println(people4 != people2) //false
        println(people2 != people3) //false
        //not referential equal
        println(people4 !== people2) //false
        println(people2 !== people3) //true
    }
}

class People(var name: String, val id: Int){

    override fun equals(obj: Any?): Boolean{
        if(obj is People){
            return name==obj.name&&id==obj.id
        }
        return false
    }
}