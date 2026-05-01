package Practise_04042026;

import java.util.Arrays;
import java.util.Scanner;

public class Capitalise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(capital(s));
    }

    public static StringBuilder capital(String a) {
        StringBuilder sb = new StringBuilder();
        String[] words = a.split(" ");

        for (int i=0;i< words.length;i++) {

            String word = words[i];

            for (int j=0;j<word.length();j++) {

                if (j == 0) {
                    String first = String.valueOf(word.charAt(0));

                    sb.append(first.toUpperCase());
                } else {
                    sb.append(word.charAt(j));
                }
            }
            //sb.append(" ");

            sb.append(" ");

        }
        return sb;

    }
}
