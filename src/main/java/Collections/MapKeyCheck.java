package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class MapKeyCheck {

    public static void main (String[] args) {

        HashMap<String, Integer> m = new HashMap<>();

        m.put("Apple", 100);
        m.put("Banana", 50);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        String s = sc.next();

        if (m.containsKey(s)) {
            System.out.println("Key "+ s + " is exists");
        }
        else {
            System.out.println(s + " does not exists");
        }
    }
}
