package com.kodilla.abstracts.homework;

public class Person {
   private String firstName;
   private int age;
   private Job job;
    public Person (String firstName,int age,Job job){
        this.firstName=firstName;
        this.age=age;
        this.job=job;
    }

    public Job getJob() {
        return job;
    }

    //public String responsibilitiesForJob (){
   //     System.out.println("this job has the following: " + this.job.getResponsibilities() + "responsibilities");
    //return responsibilitiesForJob();}
}
