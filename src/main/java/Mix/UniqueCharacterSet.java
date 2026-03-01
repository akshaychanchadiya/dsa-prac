package Mix;

import java.util.HashSet;

public class UniqueCharacterSet {

    public static void main (String[] args) {
        String a = "banana";

        HashSet<Character> s = new HashSet<>();

        for (char c : a.toCharArray()) {

            s.add(c);
        }
        System.out.println(s);
    }
}
