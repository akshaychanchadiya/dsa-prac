package Practise_04042026;

import java.util.Scanner;

public class ReverseStringDSANOSTUB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        StringBuilder sb = new StringBuilder(a);
        String reverse = sb.reverse().toString();

        //System.out.println(reverse);

    }
}
