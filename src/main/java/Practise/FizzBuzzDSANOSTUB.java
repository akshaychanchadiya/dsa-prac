package Practise;

import java.util.*;


public class FizzBuzzDSANOSTUB{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n ; i++) {
            int a = i;

            if (a%3 == 0 && a%5 == 0) {
                System.out.println ("FizzBuzz");
            }
            else if (a%3 == 0) {
                System.out.println ("Fizz");
            }
            else if (a%5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(a);
            }
        }
    }
}
