package com.company;

public class Server {

    private int[] countVehicles;
    private int commonCountVehicles;
    private int limitVehicle;
    private Vehicle[] vehicles;
    public Server (int size,int limit) {
        countVehicles = new int[size];
        vehicles = new Vehicle[limit];
        this.limitVehicle = limit;
    }

    public int getLimitVehicle () {
        return limitVehicle;
    }


    public int[] getCountVehicles() {
        return countVehicles;
    }

    public int getCurrentCountVehicle () {
        return commonCountVehicles;
    }

    public void addTransport (int numberVehicles, Vehicle vehicle, int id) {
        countVehicles[numberVehicles]++;
        vehicles [commonCountVehicles] = vehicle;
        vehicles[commonCountVehicles].move(id);
        commonCountVehicles ++;
    }

}
