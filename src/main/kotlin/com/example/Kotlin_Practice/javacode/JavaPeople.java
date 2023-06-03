package com.example.Kotlin_Practice.javacode;

public class JavaPeople {
    private final String firstName;
    private boolean fullTime;

    public JavaPeople(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }

    public JavaPeople(String firstName,boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
}
