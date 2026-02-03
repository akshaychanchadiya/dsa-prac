package Practise;

public class Factorial {

    public static void main (String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    public static int factorial(int a) {
        int fact = 1;
        for (int i=a; i >= 1 ; i--) {
            fact = i*fact;
        }

        return fact;
    }
}
