package Array1D;

import java.util.Arrays;

public class Reverse {

    public static void main (String[] args) {

        int[] a = {1,2,3,4};

        int[] b = new int[a.length];

        int j = 0;

        for (int i=a.length-1;i>=0;i--) {
            b[j]=a[i];
            j++;
        }

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(reverse()));
    }

    //second method (without extra array)

    public static int[] reverse() {

        int[] arr = {1,2,3,4};

        int start = 0;
        int end = arr.length-1;

        while (start < end) {

            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;

            start++;
            end--;

        }
        return arr;
    }
}
