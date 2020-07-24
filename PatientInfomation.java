package com.example.patient.compositpatient;

public class PatientInfomation {

 public static void main(String[] args)
 {
  AgeFilter ageFilter1=new AgeFilter(18);
  AgeFilter ageFilter2=new AgeFilter(47);

  CompositeFilter compositeAgeFilter=new CompositeFilter();
  compositeAgeFilter.addIFilter(ageFilter1);
  compositeAgeFilter.addIFilter(ageFilter2);

  NameFilter nameFilter1=new NameFilter("Sri");
  NameFilter nameFilter2=new NameFilter("rama");

  CompositeFilter compositeNameFilter=new CompositeFilter();
  compositeAgeFilter.addIFilter(nameFilter1);
  compositeAgeFilter.addIFilter(nameFilter2);

  EmailFilter emailFilter1=new EmailFilter("ad@cd.com");
  EmailFilter emailFilter2=new EmailFilter("ab@md.com");

  CompositeFilter compositeEmailFilter=new CompositeFilter();
  compositeAgeFilter.addIFilter(emailFilter1);
  compositeAgeFilter.addIFilter(emailFilter2);

  CompositeFilter compositeFilter=new CompositeFilter();
  compositeAgeFilter.addIFilter(compositeAgeFilter);
  compositeAgeFilter.addIFilter(compositeEmailFilter);
  compositeAgeFilter.addIFilter(compositeNameFilter);

  compositeFilter.filter();


 }


}


