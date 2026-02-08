package Array1D;

public class MaxNumberArray {
     public static void main (String[] args) {
         int[] a = {3,9,1,7};

         int max = a[0];

         for (int i=0;i<a.length;i++) {

             if (a[i] > max) {
                 max = a[i];
             }
         }
         System.out.println("Maximum no in array is : "+max);
     }
}
