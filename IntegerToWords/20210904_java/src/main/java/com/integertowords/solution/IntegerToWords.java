package com.integertowords.solution;

public class IntegerToWords {

    private UnitsAndTeensConverter unitsAndTeensConverter;
    private TensConverter tensConverter;
    private HundredsConverter hundredsConverter;
    private ThousandsAndGreaterConverter thousandsAndGreaterConverter;

    IntegerToWords() {
        this.unitsAndTeensConverter = new UnitsAndTeensConverter();
        this.tensConverter = new TensConverter();
        this.hundredsConverter = new HundredsConverter();
        this.thousandsAndGreaterConverter = new ThousandsAndGreaterConverter();
    }

    public String convert(int number) {
        StringBuilder sb = new StringBuilder();
        int divisor = 1000000000;
        while (divisor >= 1000) {
            number = this.thousandsAndGreaterConverter.convert(sb, number, divisor);
            divisor /= 1000;
        }
        number = this.hundredsConverter.convert(sb, number);
        number = this.tensConverter.convert(sb, number);
        this.unitsAndTeensConverter.convert(sb, number);
        return sb.toString();
    }
}
