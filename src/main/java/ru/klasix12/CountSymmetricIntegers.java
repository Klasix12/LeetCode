package ru.klasix12;

public class CountSymmetricIntegers {
    public static int countSymmetricIntegers(int low, int high) {
        int res = 0;
        while (low <= high) {
            if (low > 99 && low < 999) {
                low++;
                continue;
            }
            if (low % 10 == low / 10 || (low % 100) % 10 + (low % 100) / 10 == (low / 100) % 10 + (low / 100) / 10) {
                res++;
            }
            low++;
        }
        return res;
    }

    public static void main(String[] args) {
        assert countSymmetricIntegers(1, 100) == 9;
        assert countSymmetricIntegers(1200, 1230) == 4;
        assert countSymmetricIntegers(100, 1782) == 44;
    }
}
