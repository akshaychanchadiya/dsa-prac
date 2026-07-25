package Practise_04042026;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringCompressionDSANOSTUB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println(compressedString(a));


    }

    public static String compressedString(String a) {

        // String = "aabccccc"

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i=1;i<a.length();i++) {

            if (a.charAt(i)==a.charAt(i-1)) {
                count++;
            }
            else {
                sb.append(a.charAt(i-1));
                sb.append(count);
                count = 1;
            }
        }

        sb.append(a.charAt(a.length() - 1));
        sb.append(count);

        return sb.toString();

    }

}
