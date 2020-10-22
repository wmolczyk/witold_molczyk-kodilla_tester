package com.kodilla.inheritance.homework;

public class OperatingSubSystem_1 extends OperatingSystem{
    public OperatingSubSystem_1 (int releaseYear) {
        super (releaseYear);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("OS Sub1 is turned on");

    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("OS Sub1 is turned off");
    }
}
