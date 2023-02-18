package de.aikiit.fingeruebungen.calculator;

public class Addierer {
    private String summand1;
    private String summand2;

    Addierer(String summand1, String summand2) {
        this.summand1 = summand1;
        this.summand2 = summand2;
    }

    public String getSumme() {
        return summand1 + summand2;
    }

}
