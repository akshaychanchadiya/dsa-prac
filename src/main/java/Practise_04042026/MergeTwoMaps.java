package Practise_04042026;

import java.util.HashMap;

public class MergeTwoMaps {

    public static void main(String[] args) {
        HashMap<Integer,String> m1 = new HashMap<>();
        m1.put(1,"A");m1.put(2,"B");

        HashMap<Integer,String> m2 = new HashMap<>();
        m2.put(3,"C");m2.put(4,"D");


        for (int a : m2.keySet()) {
            m1.put(a,m2.get(a));
        }

        System.out.println(m1);

    }
}
