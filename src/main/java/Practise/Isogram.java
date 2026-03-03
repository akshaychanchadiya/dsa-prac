package Practise;

import java.util.HashMap;
import java.util.HashSet;

public class Isogram {
    public static void main(String[] args) {
        String a = "machine";

        boolean isogram = true;

        HashSet<Character> s = new HashSet<>();

        for (char c : a.toCharArray()) {
            if (s.contains(c)) {
                isogram = false;
                break;
            }
            else {
                s.add(c);
            }
        }
        if (isogram == true) {
            System.out.println("Isogram");
        }
        else {
            System.out.println("Not an Isogram");
        }
    }
}
