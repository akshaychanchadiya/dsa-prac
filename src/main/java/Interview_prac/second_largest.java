package Interview_prac;

public class second_largest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 20, 15};

        int first = 0;
        int second = 0;

        for(int i=1;i<arr.length ; i++) {
            if(arr[i]>first) {
                second = first;
                first = arr[i];
            } else if (arr[i]<first && arr[i]>second) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
