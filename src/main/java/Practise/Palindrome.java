package Practise;

public class Palindrome {

    public static void main(String[] args) {
        int n = 121;
        System.out.println(palindrome(n));
    }

    public static boolean palindrome(int a) {
        int org = a;
         int rev = 0;

         while (a>0) {
             rev = rev * 10 + a%10;
             a = a/10;
         }
         if (rev==org) {
             return true;
         }
         return false;
    }
}
