package StringSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collections {

    public static void main(String[] args) { // entry point
        // CRUD in arraylist
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("a");
        a1.add("b");
        a1.add("c");

        System.out.println(a1);
        System.out.println(a1.get(1));

        a1.set(1, "d");
        System.out.println(a1);

        a1.remove(1);
        System.out.println(a1);

        //CRUD in sets
        HashSet<String> s1 = new HashSet<>();
        s1.add("A");   //CREATE
        s1.add("B");
        s1.add("C");

        System.out.println(s1); //READ ENTIRE SET
        System.out.println(s1.contains("A")); //READ ONE VALUE

        //UPDATE: DELETE AND ADD
        s1.remove("B");
        s1.add("D");
        System.out.println(s1);

        s1.remove("D"); //DELETE
        System.out.println(s1);


        //CRUD in maps
        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(1, "A"); //CREATE
        m1.put(2, "B");
        m1.put(3, "C");


        System.out.println(m1);
        System.out.println(m1.get(2));

        m1.put(2, "D"); //UPDATE
        System.out.println(m1);

        m1.remove(2); //Delete
        System.out.println(m1);

    }
}
