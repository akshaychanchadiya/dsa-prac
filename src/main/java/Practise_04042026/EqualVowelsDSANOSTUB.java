package Practise_04042026;

import java.util.Scanner;

public class EqualVowelsDSANOSTUB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int vowels = 0;
        //int consonants = 0;

        for (char c : a.toCharArray()) {
            if (c == 'a'|| c == 'e'|| c == 'i'|| c == 'o' || c == 'u') {
                vowels++;
            }
            else {
                consonants++;
            }
        }

        System.out.println(consonants-vowels);
    }
}
