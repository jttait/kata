package com.projecteuler.problem22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordScorer {

    public int scoreWord(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum += word.charAt(i) - 'A' + 1;
        }
        return sum;
    }

    public int scoreList(List<String> words) {
        words = words.stream().sorted().collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < words.size(); i++) {
            sum += (i + 1) * scoreWord(words.get(i));
        }
        return sum;
    }

    public int scoreFile(String filename) {
        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = br.readLine();
            List<String> words = Arrays.asList(str.split(","));
            words = words.stream().map(word -> word.replaceAll("\"", "")).collect(Collectors.toList());
            return scoreList(words);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
