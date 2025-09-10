package ru.klasix12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NRepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
