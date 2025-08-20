package ru.klasix12;

public class ContainerWithMostWater {
    static public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = Math.min(height[i], height[j]) * (j - i);
        while (j > i) {
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
