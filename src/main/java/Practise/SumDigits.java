package Practise;

public class SumDigits {

    // Input: 123 → Output: 6

    public static void main(String[] args) {
        int b = 123;
        System.out.println(sumDigits(b));
    }

    public static int sumDigits(int a) {
        int sum = 0;

        while(a>0) {
            int digit = a%10;
            sum = sum + digit;
            a = a/10;
        }
        return sum;

    }
}
