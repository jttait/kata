package com.wordwrap.wordwrapkata;

public class Wrapper {

    public static String wrap(String words, int maxLineLength) {
        StringBuilder sb = new StringBuilder();
        int pos = 0;

        while(words.substring(pos).length() > maxLineLength) {
            int indexOfSpace = words.lastIndexOf(" ", maxLineLength);
            if (indexOfSpace == -1) {
                sb.append(words, 0, maxLineLength);
                words = words.substring(maxLineLength);
            } else {
                sb.append(words, 0, indexOfSpace);
                words = words.substring(indexOfSpace + 1);
            }
            sb.append("\n");
        }
        sb.append(words);
        return sb.toString();
    }
}
