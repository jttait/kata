package com.integertowords.solution;

public class HundredsConverter {

    private UnitsAndTeensConverter unitsAndTeensConverter;

    HundredsConverter() {
        this.unitsAndTeensConverter = new UnitsAndTeensConverter();
    }

    public int convert(StringBuilder sb, int number) {
        if (number < 100) {
            return number;
        }
        int hundreds = number / 100;
        this.unitsAndTeensConverter.convert(sb, hundreds);
        sb.append(" hundred");
        number -= hundreds * 100;
        if (number > 0) {
            sb.append(" and ");
        }
        return number;
    }

}
