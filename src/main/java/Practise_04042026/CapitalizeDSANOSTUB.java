package Practise_04042026;

import java.util.ArrayList;
import java.util.Scanner;

public class CapitalizeDSANOSTUB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String[] words = a.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<words.length;i++) {
            String word = words[i];

            for (int j=0; j < word.length();j++) {
                if(j==0) {
                    String first = String.valueOf(word.charAt(j));

                    sb.append(first.toUpperCase());
                }
                else {
                    sb.append(word.charAt(j));
                }
            }
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
