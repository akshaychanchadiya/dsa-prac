package Collections;

import java.util.HashSet;

public class UniqueCharSet {

    public static void main (String[] args) {
        String a = "banana";

        HashSet<Character> s = new HashSet<>();

        for (int i=0;i<a.length();i++) {
            char c = a.charAt(i);

            if (!s.contains(c)) {
                s.add(c);
            }
        }

        System.out.println(s);
    }
}
