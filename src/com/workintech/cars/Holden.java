package com.workintech.cars;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("simple name: "+getClass().getSimpleName());
        return "Holden's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println("simple name: "+getClass().getSimpleName());
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        System.out.println("simple name: "+getClass().getSimpleName());
        return "Mitsubishi is braking";
    }
}
