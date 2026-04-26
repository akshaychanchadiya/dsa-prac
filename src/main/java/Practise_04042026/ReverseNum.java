package Practise_04042026;

import java.util.Scanner;

public class ReverseNum {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt();

        System.out.println(reverse(n));
    }

    public static int reverse(int a) {


        StringBuilder sb = new StringBuilder();
        sb.append(a);
        String r = sb.reverse().toString();

        int rev = Integer.valueOf(r);
        return rev;

    }
}
