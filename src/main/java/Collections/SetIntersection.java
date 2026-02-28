package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetIntersection {

    public static void main (String[] args) {

        HashSet<Integer> s1 = new HashSet<>();
        s1.add(10);s1.add(15);s1.add(12);s1.add(13);

        HashSet<Integer> s2 = new HashSet<>();
        s2.add(10);s2.add(25);s2.add(12);s2.add(93);

        ArrayList<Integer> a = new ArrayList<>();

        for (int x : s1) {
            if (s2.contains(x)) {
                a.add(x);
            }
        }

        System.out.println(a);


    }
}
