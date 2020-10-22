package com.kodilla.inheritance.homework;

public class OperatingSubSystem_2 extends OperatingSystem {
    public OperatingSubSystem_2 (int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("OS Sub2 is turned on");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("OS Sub2 is turned off");
    }
}
