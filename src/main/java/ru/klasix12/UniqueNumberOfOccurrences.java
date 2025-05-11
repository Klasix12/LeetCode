package ru.klasix12;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> m = new HashMap<>(arr.length);
        for (int i : arr) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>(m.values());
        return set.size() == m.size();
    }

    public static void main(String[] args) {
        assert uniqueOccurrences(new int[]{1,2,2,1,1,3});
        assert uniqueOccurrences(new int[]{-4,3,3});
    }
}
