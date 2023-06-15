package com.example.Kotlin_Practice.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGeneric {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("exam1");
        list.get(0).toUpperCase();

        List list2=new ArrayList();
        list.add("exam2");

        //boolean b = list2 instanceof List<String>; -> JVM doesn't understand generics
        boolean b = list2 instanceof List;
    }
}
