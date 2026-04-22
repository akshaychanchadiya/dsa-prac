package Practise_04042026;

import java.util.*;

public class FindDuplicatesInList {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,2,4,3,5);

        Map<Integer,Integer> map = new TreeMap<>();

        for (int i=0;i<a.size();i++) {
            map.put(a.get(i),(map.getOrDefault(a.get(i),0)+1));
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}
