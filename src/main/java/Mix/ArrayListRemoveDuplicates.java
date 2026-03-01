package Mix;

import java.util.ArrayList;

public class ArrayListRemoveDuplicates {

    public static void main (String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);a.add(80);a.add(40);a.add(30);a.add(10);a.add(40);

        ArrayList<Integer> b = new ArrayList<>();

        for (int i=0;i<a.size();i++) {

            if (!b.contains(a.get(i))) {
                b.add(a.get(i));
            }
        }
        System.out.println(b);
    }
}
