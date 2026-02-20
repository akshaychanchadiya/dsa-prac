package Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) { //entry point

        Scanner sc = new Scanner(System.in); //scanner object

        System.out.print("Enter your name: ");
        String name = sc.next(); //one word

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");

        sc.close();

    }
}
