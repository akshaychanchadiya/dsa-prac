package Practise_04042026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseListManually {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(10,20,30,40);

        List<Integer> rev = new ArrayList<>();

        for (int i=a.size()-1;i>=0;i--) {
            rev.add(a.get(i));
        }

        System.out.println(rev);


    }
}
