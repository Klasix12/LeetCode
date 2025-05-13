package ru.klasix12;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        List<String> l = new ArrayList<>();
        int i = s.length() - 1;
        while (i >= 0) {
            char c = s.charAt(i);
            if (c != ' ') {
                StringBuilder sb = new StringBuilder();
                int j = i;
                while (j >= 0) {
                    c = s.charAt(j);
                    if (c == ' ') {
                        break;
                    }
                    j--;
                }
                sb.append(s, j+1, i + 1);
                i = j;
                l.add(sb.toString());
            }
            i--;
        }
        return String.join(" ", l);
    }

    public static void main(String[] args) {
        assert reverseWords("    denis penis   hi    ").equals("hi penis denis");
    }
}

