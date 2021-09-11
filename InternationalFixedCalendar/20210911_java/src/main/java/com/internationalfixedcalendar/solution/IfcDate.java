package com.internationalfixedcalendar.solution;

import java.util.List;
import java.util.Objects;

public class IfcDate {

    private final int year;
    private final int month;
    private final int day;
    private final int index;

    IfcDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        List<Integer> monthLengths = getMonthLengths();
        int index = day;
        for (int i = 0; i < this.month - 1; i++) {
            index += monthLengths.get(i);
        }
        this.index = index;
    }

    IfcDate(int year, int index) {
        this.year = year;
        this.index = index;
        List<Integer> monthLengths = getMonthLengths();
        int month = 1;
        for (int i = 0; index > monthLengths.get(i); i++) {
            index -= monthLengths.get(i);
            month++;
        }
        this.month = month;
        this.day = index;
    }

    public int getIndex() {
        return this.index;
    }

    public int getYear() {
        return this.year;
    }

    private List<Integer> getMonthLengths() {
        List<Integer> commonYearMonthLengths = List.of(28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 1);
        List<Integer> leapYearMonthLengths = List.of(28, 28, 28, 28, 28, 29, 28, 28, 28, 28, 28, 28, 28, 1);
        return (isLeapYear()) ? leapYearMonthLengths : commonYearMonthLengths;
    }

    private boolean isLeapYear() {
        return this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IfcDate ifcDate = (IfcDate) o;
        return year == ifcDate.year &&
                month == ifcDate.month &&
                day == ifcDate.day &&
                index == ifcDate.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day, index);
    }

    @Override
    public String toString() {
        return "IfcDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", index=" + index +
                '}';
    }
}
