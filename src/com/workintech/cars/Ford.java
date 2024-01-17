package com.workintech.cars;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("simple name: "+getClass().getSimpleName());
        return "Ford's engine is starting";

    }

    @Override
    public String accelerate() {
        System.out.println("simple name: "+getClass().getSimpleName());
        return "Ford is accelerating";
    }

    @Override
    public String brake() {
        System.out.println("simple name: "+getClass().getSimpleName());
        return "Ford is braking";

    }
}
