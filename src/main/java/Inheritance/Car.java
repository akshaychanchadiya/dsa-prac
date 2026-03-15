package Inheritance;

public class Car extends Vehicle{
    private int numberOfDoors;

    Car(String brand,String speed,int numberOfDoors) {
        super(brand,speed);
        this.numberOfDoors = numberOfDoors;
        System.out.println("Inside Car Constructor");
    }

    public void openTrunk() {
        System.out.println("open trunk.");
    }

    @Override
    public void start() {
        System.out.println("Car is Started");
    }

    @Override
    public void stop(){
        System.out.println("Car is Stopped");
    }
}
