package Practise_04042026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringsStartingWithVowel {

    public static void main(String[] args) {

        List<String> a = Arrays.asList("apple","dog","elephant","cat","ice");

        List<String> b = new ArrayList<>();

        for (String word : a) {

            char first = word.toLowerCase().charAt(0);
                if (first == 'a'|| first == 'e'|| first == 'i'|| first == 'o'|| first == 'u') {
                    b.add(word);
            }
        }
        System.out.println(b);
    }
}
