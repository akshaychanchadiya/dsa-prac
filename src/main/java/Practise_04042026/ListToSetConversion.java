package Practise_04042026;

import java.util.*;

public class ListToSetConversion {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A","B","A","C");

        Set<String> set = new LinkedHashSet<>(list);

        System.out.println(set);
    }
}
