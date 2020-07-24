package com.example.patient.compositpatient;

public class AgeFilter implements IFilter{

   int  age;

    public AgeFilter(int age) {
        this.age = age;
    }

    @Override
    public void filter() {
        System.out.println("age"+age);
    }
}