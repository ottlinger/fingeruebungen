package de.aikiit.fingeruebungen.calculator;

public class Addierer {
    private String summand1;
    private String summand2;

    public Addierer(String summand1, String summand2) {
        this.summand1 = summand1;
        this.summand2 = summand2;
    }

    public boolean isNumeric() {
        return true;
    }

    public String getSumme() {
        return String.valueOf(Double.valueOf(summand1) + Double.valueOf(summand2));
    }

}
