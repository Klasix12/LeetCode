package ru.klasix12;

import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] res = new int[len];

        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
        }

        for (int i = 0; i < len; i++) {
            int idx = index[i];
            int num = nums[i];

            if (res[idx] != -1) {
                for (int j = i; j > idx; j--) {
                    res[j] = res[j - 1];
                }
            }
            res[idx] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        assert Arrays.equals(new int[]{4, 0, 1, 3, 2}, createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,0}));
    }
}
