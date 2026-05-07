package Practise_04042026;

public class MaxFromArrray {

    public static void main(String[] args) {

        int[] arr = {10,50,30,80,40};

        int max = arr[0];

        for(int i=0;i<arr.length-1;i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
