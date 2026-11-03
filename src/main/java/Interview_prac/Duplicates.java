package Interview_prac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : arr) {
            if(!seen.contains(num)) {
                seen.add(num);
            }
            else {
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);
    }
}
