package com.example.Kotlin_Practice.javacode;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaCar {
    private String color;
    private String model;
    private int year;

    public JavaCar(String color,String model,int year){
        this.color=color;
        this.model=model;
        this.year=year;
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


}
