package de.aikiit.fingeruebungen.date;

import java.time.LocalDate;

public class DateCalculator {

    public static void main(String[] args) {
        DateCalculator.calculateDates();
    }

    private static void calculateDates() {
        LocalDate start = LocalDate.of(2024, 1, 1);
        while (true) {
            if (68 == calcSum()) {
                System.out.println(start);
            }
            start.plusDays(1L);
        }
    }

    private static int calcSum() {
        return 0;
    }

}
