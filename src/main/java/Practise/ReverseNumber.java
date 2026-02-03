package Practise;

public class ReverseNumber {

    public static void main (String[] args) {
        int n = 1234;
        System.out.println(reverse(n));
    }


    public static int reverse(int a) {
        int rev = 0;

        while(a>0) {
            rev = rev * 10 + a%10;
            a = a/10;
        }
        return rev;
    }
}
