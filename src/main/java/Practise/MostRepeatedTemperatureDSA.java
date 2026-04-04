package Practise;

import java.util.*;

public class MostRepeatedTemperatureDSA {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = mostRepeatedTemperature(n, a);
        System.out.println(ans);
    }

    // TODO: Implement this method
    public static int mostRepeatedTemperature(int n, int[] a) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i<n; i++) {
            map.put(a[i],map.getOrDefault(a[i],0) + 1);
        }

        int mostRepeated = 0;
        int highestCount = 0;
        for (int key : map.keySet()) {
            int count = map.get(key);

            if (count > highestCount) {
                highestCount = count;
                mostRepeated = key;
            }
            else if (count == highestCount) {
                if (key > mostRepeated) {
                    mostRepeated = key;
                }
            }
        }
        return mostRepeated;


    }
}
