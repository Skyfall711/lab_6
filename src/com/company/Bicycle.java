package com.company;

public class Bicycle extends Vehicle{
    public Bicycle(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        P.rintln("Велосипед под номером " + id + " выехал к точке назначения");
    }
}
