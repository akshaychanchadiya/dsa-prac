package Mix;

import java.util.HashMap;

public class AnagramCheck {

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        if (a.length() != b.length()) {
            System.out.println("Not an Anagram");
        }

        HashMap<Character,Integer> m = new HashMap<>();

        for (char c : a.toCharArray()) {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for (char d : b.toCharArray()) {
            m.put(d,m.getOrDefault(d,0)-1);
        }
        for (int v : m.values()) {
            if (v != 0) {
                System.out.println("Not an Anagram");
            }
        }
        System.out.println("Anagram");
    }
}
