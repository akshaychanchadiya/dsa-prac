package String;

import com.sun.jna.StringArray;

import java.util.Arrays;

public class Reverse {

    public static void main (String[] args) {

        String s = "Hello World";
        String result = "";

        String[] a = s.split(" ");

        for (int j=0;j<a.length;j++) {

            String w1 = a[j];
            String r = "";

            for(int i=w1.length()-1;i>=0;i--) {

                r += w1.charAt(i);
            }

            result += r;

            if (j != a.length-1){
                result += " ";
            }
        }
        System.out.println(result);


    }
}
