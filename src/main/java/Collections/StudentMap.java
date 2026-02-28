package Collections;

import java.util.HashMap;

public class StudentMap {

    public static void main (String[] args) {

        HashMap<String, Integer> m = new HashMap<>();
        m.put("Akshay",10);
        m.put("Falak",5);
        m.put("Elisha",12);

        System.out.println(m);
    }
}
