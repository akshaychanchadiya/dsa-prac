package Practise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicateDSAMOCK {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++)
            nums[i] = scanner.nextInt();
        scanner.close();

        boolean result = containsDuplicate(nums);
        System.out.print(String.valueOf(result));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
