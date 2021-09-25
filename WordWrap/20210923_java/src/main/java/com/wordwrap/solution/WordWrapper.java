package com.wordwrap.solution;

public class WordWrapper {
    private final String word;

    public WordWrapper(String word) {
        this.word = word;
    }

    public String wrap(int maxLineLength) {
        return wrapLine(this.word, maxLineLength);
    }

    private String wrapLine(String s, int maxLineLength) {
        if (s.length() < maxLineLength) {
            return s;
        }

        int indexOfFirstSpace = s.indexOf(' ');
        if (indexOfFirstSpace == -1) {
            return s;
        }

        int lastPossibleSpace = s.lastIndexOf(" ", maxLineLength + 1);

        String head = (lastPossibleSpace == -1) ? s.substring(0, indexOfFirstSpace) : s.substring(0, lastPossibleSpace);
        String tail = s.substring(head.length() + 1);

        return head + "\n" + wrapLine(tail, maxLineLength);
    }
}
