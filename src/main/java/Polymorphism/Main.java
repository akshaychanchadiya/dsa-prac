package Polymorphism;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle("Circle",5);
        Shape s2 = new Rectangle("Rectangle",4, 6);
        Shape s3 = new Triangle("Triangle",3, 8);

        System.out.println(s1.getName() + " Area: " + s1.calculateArea());
        System.out.println(s2.getName() + " Area: " + s2.calculateArea());
        System.out.println(s3.getName() + " Area: " + s3.calculateArea());


    }
}
