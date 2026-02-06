package Practise;

public class ZeroCount {
    public static int countZero(int n) {
        int count = 0;

        while(n>0) {
            if (n%10 == 0) {
                count++;

            }
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 6008500;

        System.out.println(countZero(a));
    }
}

