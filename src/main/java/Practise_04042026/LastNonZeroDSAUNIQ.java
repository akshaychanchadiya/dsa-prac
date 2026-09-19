package Practise_04042026;

import java.util.Scanner;

public class LastNonZeroDSAUNIQ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans = lastNonZero(a, n);
            System.out.println(ans);
            t--;
        }
    }

    static int lastNonZero(int a[], int n){

        int b = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b = i+1;
            }
        }
        return b;

    }
}
