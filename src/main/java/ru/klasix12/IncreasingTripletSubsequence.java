package ru.klasix12;


public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < f) {
                f = num;
            } else if (num < s && num > f) {
                s = num;
            } else if (num > s) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        assert increasingTriplet(new int[]{20,100,10,12,5,13});
    }
}
