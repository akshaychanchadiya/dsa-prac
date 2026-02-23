package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMaxValue {

    public static void main (String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(10); a.add(20); a.add(12); a.add(15); a.add(18);

        int max = a.get(0);

        for (int i=0;i<a.size();i++) {

            if (a.get(i) >max) {
                max = a.get(i);
            }
        }
        System.out.println(max);

        System.out.println(Collections.max(a));
    }
}
