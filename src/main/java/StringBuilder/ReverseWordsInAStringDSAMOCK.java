package StringBuilder;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInAStringDSAMOCK {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWordsInAString(s));
        sc.close();
    }

    static String reverseWordsInAString(String s){

        StringBuilder sb = new StringBuilder();
        String[] st = s.split(" ");

        for (int i=st.length-1;i>=0;i--) {
            sb.append(st[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
