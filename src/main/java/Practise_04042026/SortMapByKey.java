package Practise_04042026;

import java.util.*;

public class SortMapByKey {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(3,"C");map.put(1,"A");map.put(2,"B");

        //Map<Integer,String> sortedMap = new TreeMap<>(map);

        Map<Integer,String> sortedMap = new TreeMap<>(map);

        System.out.println(sortedMap);


    }
}
