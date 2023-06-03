package com.example.Kotlin_Practice.javacode;

public class JavaPeople {
    private final String firstName;
    private final boolean fullTime;

    public JavaPeople(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }

    public JavaPeople(String firstName,boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }
}
