package com.example.patient.compositpatient;

import java.util.ArrayList;

public class CompositeFilter implements  IFilter {
    ArrayList<IFilter> filterArrayList=new ArrayList<IFilter>();

    @Override
    public void filter() {
         for(IFilter iFilter:filterArrayList)
         {
             iFilter.filter();
         }
    }

    public void addIFilter(IFilter iFilter){
        filterArrayList.add(iFilter);
    }

    public void removeIFilter(IFilter iFilter){
        filterArrayList.remove(iFilter);
    }
}
