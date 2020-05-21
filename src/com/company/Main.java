package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int num;
        Server server1 = new Server(4,15);

        Bicycle b;
        Car c;
        RollerSkates r;
        Jumpers j;

        for(int i=0;i<15;i++) {
            num = random.nextInt(4);
            switch (num) {
                case 0:
                    b = new Bicycle(i);
                    server1.addTransport(0, b,i);
                    break;
                case 1:
                    c = new Car(i);
                    server1.addTransport(1, c,i);
                    break;
                case 2:
                    r = new RollerSkates(i);
                    server1.addTransport(2, r,i);
                    break;
                case 3:
                    j = new Jumpers(i);
                    server1.addTransport(3, j,i);
                    break;
            }
        }

        int veh[] = server1.getCountVehicles();
        P.rintln("Велосипед: " + veh[0]);
        P.rintln("Машина: " + veh[1]);
        P.rintln("Ролики: " + veh[2]);
        P.rintln("Джамперы: " + veh[3]);



        P.rintln("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        Bus m1;
        Tractor m2;
        TractorCrawler m3;
        TractorWheeled m4;
        ServerMachines sm = new ServerMachines(4,15);

        for(int i=0;i<15;i++) {
            num = random.nextInt(4);
            switch (num) {
                case 0:
                    m1 = new Bus("Автобус",500,140,30);
                    sm.addTransport(num,m1);
                    break;
                case 1:
                    m2 = new Tractor("Трактор",400,100,2,"xz");
                    sm.addTransport(num,m2);
                    break;
                case 2:
                    m3 = new TractorCrawler("Трактор гусеничный",500,110,2,"xz");
                    sm.addTransport(num,m3);
                    break;
                case 3:
                    m4 = new TractorWheeled("Трактор на колесах",500,105,2,"xz");
                    sm.addTransport(num,m4);
                    break;
            }
        }

        int mach[] = sm.getCountVehicles();
        P.rintln("Автобус: " + mach[0]);
        P.rintln("Трактор: " + mach[1]);
        P.rintln("Гусеничный трактор: " + mach[2]);
        P.rintln("Трактор на колесах: " + mach[3]);
    }
}
