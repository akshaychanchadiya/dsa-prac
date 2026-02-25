package Collections;

import java.util.HashMap;

public class FirstUniqueCharacter {

    static int firstUniqueCharacter(String str) {

        if (str.length() == 0 || str == null) {
            return -1;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i=0;i<str.length();i++) {

            char c = str.charAt(i);
            map.put(c,map.getOrDefault(c, 0) + 1);
        }

        for (int i=0;i<str.length();i++) {

            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(firstUniqueCharacter("leetcode"));

    }
}
