package Practise;

public class ReverseString {

    //Reverse a given string without using built-in reverse().

    public static void  main(String[] args) {

        String s = "AKSHAY";
        System.out.println(reverse(s));
    }

    public static String reverse(String a) {

        String rev = "";
        for (int i = a.length()-1; i >=0 ; i--) {

            rev = rev + a.charAt(i);
        }
        return rev;
    }

}
