package com.example.patient.compositpatient;

public class EmailFilter implements IFilter{

    private String email;

    public EmailFilter(String email) {
        this.email = email;
    }

    @Override
    public void filter() {
      System.out.println("email Id"+email);
    }
}