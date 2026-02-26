package Collections;

import java.util.HashSet;

public class HashSetCheckElement {

    public static void main (String[] args) {

        HashSet<Integer> s = new HashSet<>();

        int a = 12;
        s.add(10);s.add(15);s.add(12);

        if (s.contains(12)) {
            System.out.println("Exist");
        }
        else {
            System.out.println("Not Exist");
        }

    }

}
