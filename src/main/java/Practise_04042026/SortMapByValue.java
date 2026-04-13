package Practise_04042026;

import java.util.*;

public class SortMapByValue {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"banana");
        map.put(2,"apple");
        map.put(3,"carrot");

        List<String> values = new ArrayList<>(map.values());

        Collections.sort(values);

        for (String n : values) {
            for (Integer m : map.keySet()) {
                if (map.get(m).equals(n)) {
                    System.out.println(m + " = " + n);
                }
            }
        }
    }
}
