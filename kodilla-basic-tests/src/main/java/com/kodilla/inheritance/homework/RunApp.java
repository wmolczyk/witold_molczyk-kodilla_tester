package com.kodilla.inheritance.homework;

public class RunApp {
    public static void main(String[] args) {
OperatingSystem operatingSystem = new OperatingSystem(2007);
operatingSystem.turnOn();
operatingSystem.turnOff();
System.out.println(operatingSystem.getReleaseYear());

OperatingSubSystem_1 operatingSubSystem_1 = new OperatingSubSystem_1(2010);
operatingSubSystem_1.turnOn();
operatingSubSystem_1.turnOff();
System.out.println(operatingSubSystem_1.getReleaseYear());

OperatingSubSystem_2 operatingSubSystem_2 = new OperatingSubSystem_2(2018);
operatingSubSystem_2.turnOn();
operatingSubSystem_2.turnOff();
System.out.println(operatingSubSystem_2.getReleaseYear());
    }
    }
