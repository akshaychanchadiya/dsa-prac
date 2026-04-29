package Practise_04042026;

import java.util.Arrays;
import java.util.List;

public class MergedArrays {

    public static void main(String[] args) {

        int[] nums1 = {1,3};
        int[] nums2 = {3,4};

        int[] res = new int[nums1.length + nums2.length];

        for (int i=0;i<nums1.length;i++) {
            res[i] = nums1[i];
        }

        for (int i=0;i<nums2.length;i++) {
            res[nums1.length + i] = nums2[i];
        }

        System.out.println(Arrays.toString(res));

    }
}
