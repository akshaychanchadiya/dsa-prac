package Practise;

import java.io.IOException;
import java.util.Scanner;

public class FindPeakElementDSAMOCK {
    public int findPeakElement(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            if ((i == 0 || nums[i] > nums[i - 1]) && (i == nums.length - 1 || nums[i] > nums[i + 1])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextInt();
        scanner.close();

        int peakElement = new FindPeakElementDSAMOCK().findPeakElement(nums);
        System.out.print(peakElement);
    }
}
