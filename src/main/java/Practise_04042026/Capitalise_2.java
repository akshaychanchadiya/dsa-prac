package Practise_04042026;

import java.util.Arrays;
import java.util.Scanner;

public class Capitalise_2 {
    public static void main(String[] args) {
        String a = "hello akshay! how are you?";

        String[] words = a.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i=0;i< words.length;i++) {
            String word = words[i];

            for (int j =0 ; j< word.length();j++) {
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
       // System.out.println(sb);

    }
}
