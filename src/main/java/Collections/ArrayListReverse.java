package Collections;

import java.util.ArrayList;

public class ArrayListReverse {

    public static void main (String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add("Akshay");
        a.add("Falak");
        a.add("Elisha");

        ArrayList<String> rev = new ArrayList<>();

        for (int i=a.size()-1;i>=0; i--) {
            rev.add(a.get(i));
        }

        System.out.println(rev);

    }

}
