package Practise_04042026;

import java.util.Scanner;

public class CommonArrayDSANOSTUB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i<n ; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] b = new int[m];
        for(int i = 0; i<m ; i++) {
            b[i] = sc.nextInt();
        }

        boolean status = false;

        for (int i=0; i < a.length; i++) {
            for (int j=0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    status = true;
                }
            }
        }

       if(status) {
           return;
       }
       else {
           System.out.println("-1");
       }
    }
}
