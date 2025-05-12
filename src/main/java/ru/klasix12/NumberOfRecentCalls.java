package ru.klasix12;

import java.util.LinkedList;
import java.util.List;

public class NumberOfRecentCalls {

    private final List<Integer> q;

    public NumberOfRecentCalls() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        while (!q.isEmpty() && q.get(0) < t - 3000) {
            q.remove(0);
        }
        q.add(t);
        return q.size();
    }

    public static void main(String[] args) {
        NumberOfRecentCalls ncr = new NumberOfRecentCalls();
        System.out.println(ncr.ping(1));
        System.out.println(ncr.ping(3002));
        System.out.println(ncr.ping(3003));
        System.out.println(ncr.ping(3004));
    }
}
