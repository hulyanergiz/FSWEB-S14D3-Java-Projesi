package com.workintech.skeleton;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void startEngine(){
        System.out.println(name+" engine has been started");
    }
    public void drive(){
        runEngine(this);
    }

    protected void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof GasPoweredCar){
            System.out.println("gas powered car was driven "+((GasPoweredCar)carSkeleton).getAvgKmPerLitre()+" km per litre");
        }else if(carSkeleton instanceof ElectricCar){
            System.out.println("electric car was driven "+((ElectricCar)carSkeleton).getAvgKmPerCharge()+" km per charge");
        }else if(carSkeleton instanceof HybirdCar){
            System.out.println("hybrid car was driven "+((HybirdCar)carSkeleton).getAvgKmPerLitre()+" km per litre");
        }else{
            System.out.println("invalid car type for drive method");
        }
    }

}
