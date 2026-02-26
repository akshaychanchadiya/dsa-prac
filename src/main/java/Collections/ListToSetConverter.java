package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListToSetConverter {

    public static void main (String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);a.add(20);a.add(30);a.add(10);a.add(40);

        HashSet<Integer> s = new HashSet<>();

        for (int i = 0;i<a.size();i++) {

            s.add(a.get(i));
        }

        System.out.println(s);
    }
}
