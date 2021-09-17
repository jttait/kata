package com.binarysearch.solution;

import java.util.List;

public class BinarySearch {

    private BinarySearch() {}

    public static int search(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (list.get(mid) < target) {
                left = mid + 1;
            } else if (list.get(mid) > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
