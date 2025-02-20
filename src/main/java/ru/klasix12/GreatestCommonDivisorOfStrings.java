package ru.klasix12;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("AB", "ABABAB"));
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "AB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
        System.out.println(gcdOfStrings("AAAAA", "A"));
        System.out.println(gcdOfStrings("AAAA", "AA"));
        System.out.println(gcdOfStrings("ABCDEF", "AB"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        System.out.println(gcdOfStrings("AAAAAAAAA", "AAACCC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();

        int i = l2;
        while (i > 0) {
            if (l1 % i == 0 && l2 % i == 0) {
                String res1 = str2.substring(0, i).repeat(l1 / i);
                String res2 = str1.substring(0, i).repeat(l2 / i);
                if (str1.equals(res1) && str2.equals(res2)) {
                    return str2.substring(0, i);
                }
            }
            i--;
        }
        return "";
    }
}
