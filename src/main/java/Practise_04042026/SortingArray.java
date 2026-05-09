package Practise_04042026;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        int[] c = {5, 1, 4, 2};

        for (int i=0;i<c.length;i++) {
            for (int j=i+1;j<c.length;j++) {
                if (c[i]>c[j]) {

                    int temp = c[i];
                     c[i] = c[j];
                     c[j] = temp;
                }
            }
        }

        for (int n : c) {
            System.out.println(n);
        }
    }
}
