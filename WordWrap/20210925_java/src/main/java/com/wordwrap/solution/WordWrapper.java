package com.wordwrap.solution;

public class WordWrapper {
    public static String wrap(String word, int maxLineLength) {
        if (word.length() <= maxLineLength) {
            return word;
        }

        int lastPossibleSpace = word.lastIndexOf(' ', maxLineLength);
        if (lastPossibleSpace == -1) {
            String head = word.substring(0, maxLineLength - 1);
            String tail = word.substring(maxLineLength - 1);
            return head + "-\n" + wrap(tail, maxLineLength);
        }

        String head = word.substring(0, lastPossibleSpace);
        String tail = word.substring(lastPossibleSpace + 1);

        return head + '\n' + wrap(tail, maxLineLength);
    }
}
