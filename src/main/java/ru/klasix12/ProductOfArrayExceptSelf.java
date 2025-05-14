package ru.klasix12;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int j = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            j = j * nums[i + 1];
            res[i] = res[i] * j;
        }
        return res;
    }

    public static void main(String[] args) {
        assert Arrays.equals(productExceptSelf(new int[]{1, 2, 3, 4}), new int[]{24,12,8,6});
        assert Arrays.equals(productExceptSelf(new int[]{-1,1,0,-3,3}), new int[]{0,0,9,0,0});
    }
}
