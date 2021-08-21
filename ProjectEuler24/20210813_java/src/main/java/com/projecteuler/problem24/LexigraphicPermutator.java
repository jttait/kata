package com.projecteuler.problem24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
public class LexigraphicPermutator {

    public static int findPivot(List<Character> characters) {
        for (int i = characters.size() - 1; i > 0; i--) {
            if (characters.get(i) > characters.get(i - 1)) {
                return --i;
            }
        }
        return -1;
    }

    public static int smallestSuffix(List<Character> characters, int pivot) {
        int indexOfSmallest = -1;
        for (int i = characters.size() - 1; i > pivot; i--) {
            if (characters.get(i) > characters.get(pivot) && (indexOfSmallest == -1 || characters.get(i) < characters.get(indexOfSmallest))) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static List<Character> reverseSuffix(List<Character> original, int pivot) {
        List<Character> reversed = new ArrayList<>(original);
        List<Character> abstractSuffix = original.subList(pivot + 1, original.size());
        List<Character> suffix = new ArrayList<>(abstractSuffix);
        Collections.reverse(suffix);
        for (int i = 0; i < suffix.size(); i++) {
            reversed.set(i + pivot + 1, suffix.get(i));
        }
        return reversed;
    }

    public static List<Character> next(List<Character> original) {
        int pivot = findPivot(original);
        int smallestSuffix = smallestSuffix(original, pivot);
        List<Character> notAbstract = new ArrayList<>(original);
        Collections.swap(notAbstract, pivot, smallestSuffix);
        return reverseSuffix(notAbstract, pivot);
    }

    public static List<Character> nthPermutation(List<Character> characters, int n) {
        for (int i = 1; i < n; i++) {
            characters = next(characters);
        }
        return characters;
    }
}
