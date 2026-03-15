package Inheritance;

public class Main {

    public static void main(String[] args) {

        Vehicle v = new Car("BMW","300",2);

        v.parentMethod();
        v.start();
        v.stop();

    }
}
