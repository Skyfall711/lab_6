package com.company;

public class Car extends Vehicle {
    public Car(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        P.rintln("Машина под номером " + id + " выехала из гаража к точке назначения");
    }
}
