package com.wordwrapkata.wordwrap;

public class Wrapper {

    public static String wrap(String s, int maxLineLen) {
        if (s == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int pos = 0;

        while (pos + maxLineLen < s.length()) {
            int space = s.lastIndexOf(" ", pos + maxLineLen);
            if (space == -1) {
                sb.append(s, pos, pos + maxLineLen);
                sb.append("\n");
                pos += maxLineLen;
            } else {
                sb.append(s, pos, space);
                sb.append("\n");
                pos = space + 1;
            }
        }
        sb.append(s.substring(pos));

        return sb.toString();
    }

}
