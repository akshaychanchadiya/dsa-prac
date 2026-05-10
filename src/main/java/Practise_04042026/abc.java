package Practise_04042026;

import java.util.Arrays;

public class abc {

    public static void main(String[] args) {
        String[] arr = {"A","K","S","H","A","Y"};

        int j = 3;

        String[] a = new String[arr.length];

        for (int i=0;i<arr.length;i++) {

            if (j > 5){
                j = 0;
            }
            a[i] = arr[j];
            j++;
        }

        System.out.println(Arrays.toString(a));
    }
}
