package ru.klasix12;

public class StringCompression {
    public static int compress(char[] chars) {
        int index = 0;
        int charStream = 0;
        char currentChar = chars[index];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                charStream++;
            } else {
                chars[index++] = currentChar;
                if (charStream > 1) {
                    String s = String.valueOf(charStream);
                    for (char c : s.toCharArray()) {
                        chars[index++] = c;
                    }
                    charStream = 1;
                }
                currentChar = chars[i];
            }
        }

        if (charStream == 1) {
            chars[index++] = currentChar;
        } else if (charStream > 1) {
            chars[index++] = currentChar;
            String s = String.valueOf(charStream);
            for (char c : s.toCharArray()) {
                chars[index++] = c;
            }
        }
        return index;
    }
}
