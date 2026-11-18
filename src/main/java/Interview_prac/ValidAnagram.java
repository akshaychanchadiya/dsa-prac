package Interview_prac;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if (s.length() != t.length()) {
            System.out.println("Not a Valid Anagram");
        }

        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();

        for(char c : s.toCharArray()) {
            m1.put(c,m1.getOrDefault(c,0)+1);
        }
        for(char d : t.toCharArray()) {
            m2.put(d,m2.getOrDefault(d,0)+1);
        }
        if(m1.equals(m2)) {
            System.out.println("Valid Anagram");
        }
    }
}
