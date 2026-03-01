package Collections;

import java.util.HashMap;

public class MaxValueInMap {

    public static void main (String[] args) {
        HashMap<String,Integer> m = new HashMap<>();

        m.put("A",65);m.put("B",60);m.put("C",75);m.put("D",80);

        int max = 0;

        for (String key : m.keySet()) {
            if (m.get(key) > max) {
                max = m.get(key);
            }
        }
        System.out.println(max);
    }
}
