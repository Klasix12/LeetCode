package ru.klasix12;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;
        for (int i : gain) {
            altitude += i;
            if (altitude > max) {
                max = altitude;
            }
        }
        return max;
    }
}
