package Practise;

import java.util.*;


public class MoveZeroesStringDSAJAVA{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String binaryString = sc.next();



        String result = rearrangeBinaryString(binaryString);

        System.out.println(result);
    }

    public static String rearrangeBinaryString(String s) {

        String count0 = "";
        String count1 = "";

        for (int i=0;i<s.length();i++) {
            if(s.charAt(i)=='0') {
                count0 += s.charAt(i);
            }
            else {
                count1 += s.charAt(i);
            }
        }

        String res = count0 + count1;
        return res;

    }
}
