package Practise_04042026;

import java.util.Arrays;

public class Rotate_byK {

    public static void main(String[] args) {
        int[] a = {5,8,9,3,6};

        int k = 3;

        int[] r = new int[a.length];

        for (int i = 0; i < a.length ; i++) {
            r[(i+k)%a.length] = a[i];
        }

        System.out.println(Arrays.toString(r));


    }
}
