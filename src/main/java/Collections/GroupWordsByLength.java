package Collections;

import java.util.ArrayList;

import java.util.HashMap;

public class GroupWordsByLength {

    public static void main (String[] args) {

        String[] words = {"apple", "cat", "dog", "banana", "hi"};
        HashMap<Integer, ArrayList<String>> m = new HashMap<>();

        for (String s : words) {
            int length = s.length();

            if (!m.containsKey(length)) {
                m.put(length,new ArrayList<>());
            }
            m.get(length).add(s);
        }

        System.out.println(m);
    }
}
