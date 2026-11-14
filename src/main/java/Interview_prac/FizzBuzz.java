package Interview_prac;

import java.util.Arrays;

public class FizzBuzz {

     public static void main(String[] args) {
        int n = 15;

        String[] s = new String[n];

        for(int i = 1; i <= n; i++) {
            if(i%3 == 0 && i%5 == 0) {
                s[i-1] = "FizzBuzz";
            } else if (i%3 !=0 && i%5 !=0) {
                s[i-1] = String.valueOf(i);
            } else if (i%3 == 0) {
                s[i-1] = "Fizz";
            }
              else if (i%5 == 0) {
                s[i-1] = "Buzz";
            }
        }
         System.out.println(Arrays.toString(s));
    }
}
