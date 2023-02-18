package de.aikiit.fingeruebungen.calculator;

import org.apache.commons.lang3.math.NumberUtils;

public class Addierer {
    private String summand1;
    private String summand2;

    public Addierer(String summand1, String summand2) {
        this.summand1 = summand1;
        this.summand2 = summand2;
    }

    public boolean isNumeric() {
        return NumberUtils.isCreatable(this.summand1) && NumberUtils.isCreatable(this.summand2);
    }

    public String getSumme() {
        if (!isNumeric()) {
            return "Du hast Quatsch eingegeben";
        }

        return String.valueOf(Double.valueOf(summand1) + Double.valueOf(summand2));
    }

}
