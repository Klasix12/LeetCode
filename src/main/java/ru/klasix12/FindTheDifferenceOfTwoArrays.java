package ru.klasix12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i : nums1) {
            a.add(i);
        }
        for (int i : nums2) {
            b.add(i);
        }
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for (int i : a) {
            if (!b.contains(i)) {
                res.get(0).add(i);
            }
        }
        for (int i : b) {
            if (!a.contains(i)) {
                res.get(1).add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
        assert findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}).equals(List.of(List.of(1, 3), List.of(4, 6)));
    }
}
