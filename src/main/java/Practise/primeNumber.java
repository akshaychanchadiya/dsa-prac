package Practise;

public class primeNumber {

    //Check if a Number is Prime

    public static void main(String[] args) {

        int n = 79;
        System.out.println(isPrime(n));

    }
    public static Boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        for(int i=2; i*i<=n; i++) {

            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
