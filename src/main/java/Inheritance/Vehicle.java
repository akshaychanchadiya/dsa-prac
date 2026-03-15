package Inheritance;

public class Vehicle {
    private String brand;
    private String speed;

    Vehicle(String brand,String speed){
        this.brand = brand;
        this.speed = speed;
        System.out.println("Inside Vehicle Constructor");
    }

    public void start() {
    }

    public void stop() {
    }

    public void parentMethod () {
        System.out.println("Parent Vehicle");
    }
}
