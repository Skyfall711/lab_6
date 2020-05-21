package com.company;

public class Jumpers extends Vehicle{
    public Jumpers(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        P.rintln("Прыгун под номером " + id + " выпрыгал к точке назначения");
    }
}
