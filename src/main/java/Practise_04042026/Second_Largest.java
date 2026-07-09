package Practise_04042026;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n ; i++) {
            a[i] = sc.nextInt();
        }

        int first = 0;
        int second = 0;

        for(int j =0 ; j < a.length; j++) {
            if (a[j]>first) {
                second = first;
                first = a[j];
            }
            else if (a[j]<first && a[j]>second) {
                second = a[j];
            }
        }
        System.out.println(second);
    }
}
