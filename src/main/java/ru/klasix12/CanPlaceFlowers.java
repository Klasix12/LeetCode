package ru.klasix12;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,0}, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 1;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                c--;
            } else {
                c = 2;
            }
            if (c == -1) {
                n--;
                c = 1;
            }
        }
        if (c == 0) {
            n--;
        }
        return n <= 0;
    }
}
