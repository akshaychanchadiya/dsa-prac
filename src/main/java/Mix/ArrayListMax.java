package Mix;

import java.util.ArrayList;

public class ArrayListMax {

    static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);a.add(80);a.add(40);a.add(30);a.add(10);a.add(40);

        int max = a.getFirst();

        for (int i=0;i<a.size();i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
        }
        System.out.println(max);

    }
}
