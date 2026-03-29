package Polymorphism;

public class Triangle extends Shape{
    private double base;
    private double height;

    Triangle(String name,double base,double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}
