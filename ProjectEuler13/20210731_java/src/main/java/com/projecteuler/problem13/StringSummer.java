package com.projecteuler.problem13;

import java.util.List;

public class StringSummer {

    public static String sum(List<String> numbers) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = numbers.get(0).length() - 1; i >= 0; i--) {
            int columnTotal = carry;
            for (String number : numbers) {
                columnTotal += number.charAt(i) - '0';
            }
            if (columnTotal > 9) {
                carry = columnTotal / 10;
                columnTotal -= carry * 10;
            } else {
                carry = 0;
            }
            sb.append(columnTotal);
        }

        while (carry > 1) {
            if (carry < 9) {
                sb.append(carry);
                carry = 0;
            } else {
                sb.append(carry / 10);
                carry /= 10;
            }
        }

        if (carry == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
