package Array1D;

public class SecondLargest {

    public static void main (String[] args) {
        int[] a = {10,20,4,45,90};

        int max1 = a[0];
        int max2 = a[0];

        for (int num : a) {
            if (num > max1){

                max2 = max1;
                max1 = num;
            }
            else if (num < max1 && num > max2) {
                max2 = num;
            }
        }
        System.out.println("Second largest no in array : "+max2);
    }
}
