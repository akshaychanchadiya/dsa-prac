package Array1D;

public class EvenNumberInArray {

    public static void main (String[] args) {

        int[] a = {2,5,8,11,14};

        int count = 0;

        for (int i=0;i<a.length;i++) {
            if (a[i]%2==0) {
                count++;
            }
        }
        System.out.println("Count of even numbers in given array : "+count);
    }
}
