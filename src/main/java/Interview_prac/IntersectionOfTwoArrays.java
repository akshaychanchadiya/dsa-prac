package Interview_prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);a.add(2);a.add(2);a.add(1);

        List<Integer> b = new ArrayList<>();
        b.add(2);b.add(2);

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int n : a) {
            int oldFreq = hm.getOrDefault(n,0);
            hm.put(n,oldFreq+1);
        }
        
        List<Integer> result = new ArrayList<>();

        for(int n : b) {
            int freq = hm.getOrDefault(n,0);

            if (freq > 0) {
                result.add(n);
                hm.put(n,freq - 1);
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
