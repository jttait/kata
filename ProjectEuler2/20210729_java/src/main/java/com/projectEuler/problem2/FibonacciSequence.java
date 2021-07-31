package com.projectEuler.problem2;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

    public List<Integer> generate(int upToLimit) {
        List<Integer> sequence = new ArrayList<>();
        if (upToLimit == 1) {
            sequence.add(1);
            return sequence;
        } else {
            sequence.add(1);
            sequence.add(2);
        }

        int index = 1;
        while (true) {
            int nextNumber = sequence.get(index) + sequence.get(index - 1);
            if (nextNumber > upToLimit) {
                return sequence;
            }
            sequence.add(nextNumber);
            index++;
        }
    }

    public int sumEvenValuedTerms(int upToLimit) {
        return generate(upToLimit).stream()
                .filter(term -> term % 2 == 0)
                .reduce(0, Integer::sum);
    }
}
