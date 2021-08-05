package com.projecteuler.problem19;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SundayCounter {

    public static int count(LocalDate start, LocalDate end) {
        int firstDayOfMonthIsSundayCounter = 0;
        while (start.isBefore(end) || start.isEqual(end)) {
            if (start.getDayOfWeek() == DayOfWeek.SUNDAY && start.getDayOfMonth() == 1) {
                firstDayOfMonthIsSundayCounter++;
            }
            start = start.plusDays(1);
        }
        return firstDayOfMonthIsSundayCounter;
    }

}
