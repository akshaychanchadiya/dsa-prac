package Mix;

import java.util.HashMap;

public class MaxValueInMap {

    public static void main(String[] args) {

        HashMap<String,Integer> m = new HashMap<>();
        m.put("Ram",88);
        m.put("Sita",92);
        m.put("Aman",67);

        int max = 0;

        for (int v : m.values()) {
            if (v>max) {
                max = v;
            }
        }
        for (String s : m.keySet()) {
            if (m.get(s)==max) {
                System.out.println(s);
            }
        }
    }
}
