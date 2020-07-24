package com.example.patient.compositpatient;

public class NameFilter implements IFilter{

    String name;

    public NameFilter(String name) {
        this.name = name;
    }

    @Override
    public void filter() {
        System.out.println("name:"+name);
    }
}