package Interview_prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractNumbersDSA {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("a", "1", "b", "2", "c", "d", "3", "4", "e")
        );

        List<Integer> num = new ArrayList<>();

        for(String s : list) {
            if(s.matches("\\d+")) {
                num.add(Integer.valueOf(s));
            }
        }
        System.out.println(num);
    }
}
