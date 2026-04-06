package Practise_04042026;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharacterFrequencyMap {

    public static void main(String[] args) {

        String str = "aabbcccdd";

        HashMap<Character,Integer> map = new LinkedHashMap<>();
        StringBuilder s = new StringBuilder();

        for (char a : str.toCharArray()) {
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for (char b : map.keySet()) {
            s.append(b);
            s.append(map.get(b));
        }
        System.out.println(s.toString());

    }

}
