package com.example.Kotlin_Practice;

public class JavaCheck {
    public String isWorkWithJava(boolean tf){
        return tf ? "working":"not working";
    }

    public void printNumbers(int[] numbers){
        for(int number:numbers)
            System.out.println(number);
    }
}
