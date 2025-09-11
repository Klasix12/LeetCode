package ru.klasix12;

public class MaximumDifferenceBetweenIncreasingElements {
    public static int maximumDifference(int[] nums) {
        int min = nums[0];
        int res = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            res = Math.max(res, nums[i] - min);
        }
        if (res == 0) {
            res = -1;
        }
        return res;
    }
}
