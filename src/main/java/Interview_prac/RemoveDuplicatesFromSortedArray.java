package Interview_prac;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 6, 8, 8};

        int unique_ptr = 1;
        for (int ptr = 1; ptr < nums.length; ptr++) {
            if (nums[unique_ptr - 1] != nums[ptr]) {
                nums[unique_ptr] = nums[ptr];
                unique_ptr++;
            }
        }
        System.out.println(unique_ptr);
    }
}
