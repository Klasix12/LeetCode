package ru.klasix12;

public class ReverseVowelsOfaString {
    public static String reverseVowels(String s) {
        char[] chars = new char[s.length()];
        char[] vowels = new char[s.length()];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels[j] = c;
                j++;
            } else {
                chars[i] = c;
            }
        }
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] == '\0') {
                j--;
                chars[i] = vowels[j];
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
       assert reverseVowels("IceCreAm").equals("AceCreIm");
    }
}
