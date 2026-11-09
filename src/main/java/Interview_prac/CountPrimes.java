package Interview_prac;

import java.util.ArrayList;
import java.util.List;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 17;
        List<Integer> result = new ArrayList<>();

        for (int a = 2; a < n; a++) {
            boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(a); i ++ ) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
            }
        if (isPrime) {
            result.add(a);
        }
        }
        System.out.println(result.size());

    }
}
