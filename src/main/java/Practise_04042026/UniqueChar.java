package Practise_04042026;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String s = a.toLowerCase();
        boolean unique = true;

        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if(set.contains(c)) {
                unique = false;
                break;
            }
            set.add(c);
        }

        System.out.println(unique);
    }
}
