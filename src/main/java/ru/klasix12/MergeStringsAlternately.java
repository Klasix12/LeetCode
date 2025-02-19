package ru.klasix12;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("pqrs", "ab"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        StringBuilder sb = new StringBuilder();
        int m = Math.min(l1, l2);
        for (int i = 0; i < m; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append(l1 > l2 ? word1.substring(m) : word2.substring(m));
        return sb.toString();
    }
}
