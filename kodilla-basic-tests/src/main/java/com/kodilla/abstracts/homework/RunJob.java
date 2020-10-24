package com.kodilla.abstracts.homework;

public class RunJob {
    public static void main(String[] args) {
        Person no1 = new Person("Janek", 30,new Homeless(3450,"beg on streets"));
System.out.println(no1.getJob().getResponsibilities());
Person no2 = new Person("Zenon", 23,new BookWriter(5600,"Write books"));
        System.out.println(no2.getJob().getResponsibilities());
    }
}
