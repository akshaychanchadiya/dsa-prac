package Mix;

import java.util.HashSet;

public class UniqueCharacterSet {

    public static void main (String[] args) {
        String a = "banana";

        HashSet<Character> s = new HashSet<>(); //Set

        for (char d : a.toCharArray()) {

            s.add(d);
        }
        System.out.println(s);
    }
}
