package com.company;

public class RollerSkates extends Vehicle{
    public RollerSkates(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        P.rintln("Ролики номер " + id + " покотились к точке назначения");
    }
}
