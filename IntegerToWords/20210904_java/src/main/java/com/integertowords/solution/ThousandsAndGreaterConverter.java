package com.integertowords.solution;

import java.util.HashMap;
import java.util.Map;

public class ThousandsAndGreaterConverter {

    private UnitsAndTeensConverter unitsAndTeensConverter;
    private TensConverter tensConverter;
    private HundredsConverter hundredsConverter;
    private Map<Integer, String> names;

    ThousandsAndGreaterConverter() {
        this.unitsAndTeensConverter = new UnitsAndTeensConverter();
        this.tensConverter = new TensConverter();
        this.hundredsConverter = new HundredsConverter();
        this.names = new HashMap<>();
        names.put(1000, "thousand");
        names.put(1000000, "million");
        names.put(1000000000, "billion");
    }

    public int convert(StringBuilder sb, int number, int divisor) {
        if (number < divisor) {
            return number;
        }
        int divided = number / divisor;
        number -= divided * divisor;
        divided = this.hundredsConverter.convert(sb, divided);
        divided = this.tensConverter.convert(sb, divided);
        this.unitsAndTeensConverter.convert(sb, divided);
        sb.append(" ");
        sb.append(names.get(divisor));
        if (number < 100 && number > 0) {
            sb.append(" and ");
        } else if (number > 0) {
            sb.append(" ");
        }
        return number;
    }
}
