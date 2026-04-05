package Practise_04042026;

import java.util.*;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        HashSet<Integer> set = new LinkedHashSet<>();

        for (int a : list) {
            set.add(a);
        }

        System.out.println(set);
    }

}
