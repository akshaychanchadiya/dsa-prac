package Practise_04042026;

import java.util.*;

public class SecondHighestInList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 4, 45, 99);

        int first = 0;
        int second = 0;

        for (int a : list) {
            if (a>first) {
                second = first;
                first = a;
            }
            else if (a<first && a>second) {
                second = a;
            }
        }

        System.out.println(second);
    }
}
