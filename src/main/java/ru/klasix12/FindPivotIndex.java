package ru.klasix12;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int l = 0;
        int r = 0;
        int res = -1;
        for (int i = 1; i < nums.length; i++) {
            r += nums[i];
        }
        if (l == r) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            l += nums[i-1];
            r -= nums[i];
            if (l == r) {
                return i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        assert pivotIndex(new int[]{1,7,3,6,5,6}) == 3;
        assert pivotIndex(new int[]{1,2,3}) == -1;
        assert pivotIndex(new int[]{2,1,-1}) == 0;
    }
}
