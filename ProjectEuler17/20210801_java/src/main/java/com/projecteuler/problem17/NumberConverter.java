package com.projecteuler.problem17;

public class NumberConverter {

    private int integer;
    private TensAndUnitsConverter tensAndUnitsConverter;
    private HundredsConverter hundredsConverter;

    public NumberConverter(int integer) {
        this.integer = integer;
        this.tensAndUnitsConverter = new TensAndUnitsConverter();
        this.hundredsConverter = new HundredsConverter();
    }

    public String convert() {
        if (integer == 1000) {
            return "one thousand";
        }

        StringBuilder sb = new StringBuilder();

        int hundredsDigit = integer / 100;
        int tensAndUnitsDigits = integer % 100;

        sb.append(hundredsConverter.convert(hundredsDigit));

        if (hundredsDigit > 0 && (tensAndUnitsDigits > 0)) {
            sb.append(" and ");
        }

        sb.append(tensAndUnitsConverter.convert(tensAndUnitsDigits));

        return sb.toString();
    }
}
