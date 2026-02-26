package Collections;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> m = new HashMap<>();

        int[] a = {-1, -1};

        for (int i = 0; i < nums.length; i++) {

            int comp = target - nums[i];

            if (m.containsKey(comp)) {

                a[0] = m.get(comp);
                a[1] = i;
                return a;
            }
            else {
                m.put(nums[i], i);
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,5,8,9};

        System.out.println((Arrays.toString(twoSum(nums, 7))));
        System.out.println((Arrays.toString(twoSum(nums, 22))));
    }

}


