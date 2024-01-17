package com.workintech.skeleton;

public class Main {
    public static void main(String[] args) {
        CarSkeleton carskeleton = new CarSkeleton("car", "car description");
        CarSkeleton gasPowered = new GasPoweredCar("gas powered car", "gas powered car description", 15, 8);
        CarSkeleton electric = new ElectricCar("electric car", "electric car description", 100, 100);
        CarSkeleton hybrid = new HybirdCar("hybrid car", "hybird car description", 30, 50, 4);

        gasPowered.startEngine();
        gasPowered.drive();
        electric.startEngine();
        electric.drive();
        hybrid.startEngine();
        hybrid.drive();
        carskeleton.drive();

    }
}
