package com.example.Kotlin_Practice.javacode;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaCar {

    public static int x = 4;
    private String color;
    private String model;
    private int year;
    private Object anObject;

    public JavaCar(String color,String model,int year){
        this.color=color;
        this.model=model;
        this.year=year;
    }

    public void method(Runnable r){
        new Thread(r).start();
    }

    public static String xString(){ return "this is x value" + x++; }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    public String getColor() {
        return color;
    }

    public void setColor(@Nullable String color) {
        this.color = color;
    }

    public @Nullable String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void variableMethod(int num,String... Strings){
        for(String string:Strings){ System.out.println(string); }
    }

    public void needIntArray(int[] array){
        for(int i:array){ System.out.println("Here's the int: "+i); }
    }

    @Override
    public String toString() {
        return "JavaCar{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
