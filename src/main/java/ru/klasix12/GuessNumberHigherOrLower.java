package ru.klasix12;


public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int min = 1;
        int max = n;
        while (min <= max) {
            int mid = (max - min) / 2 + min;
            int guess = guess(mid);
            if (guess == 0) {
                return mid;
            } else if (guess == -1) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}
