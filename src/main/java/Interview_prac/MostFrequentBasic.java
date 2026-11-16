package Interview_prac;

import java.util.Arrays;
import java.util.HashMap;

public class MostFrequentBasic {
    public static void main(String[] args) {
        String s = "Statements are unique.";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            int freq = map.getOrDefault(c,0);
            map.put(c,freq+1);
        }

        Character ans = '0';
        Integer maxFreq = 0;

        for(char a : map.keySet()) {
            Integer freq = map.get(a);
            if (freq > maxFreq) {
                ans = a;
                maxFreq = freq;
            }
            else if (freq == maxFreq) {
                if(a < ans) ans = a;
            }
        }

        Object[] obj = {ans, maxFreq};
        System.out.println(Arrays.toString(obj));
    }
}
