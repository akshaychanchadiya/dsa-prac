package Practise_04042026;

import java.util.Arrays;
import java.util.HashSet;

public class CompareTwoSets {

    public static void main(String[] args) {

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));

        System.out.println(s1.equals(s2));
    }
}
