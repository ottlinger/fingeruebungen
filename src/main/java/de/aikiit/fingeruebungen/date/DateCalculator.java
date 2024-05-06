package de.aikiit.fingeruebungen.date;

import java.time.LocalDate;

import com.google.common.annotations.VisibleForTesting;

public class DateCalculator {

    static final Integer TARGET = Integer.valueOf(68);

    public static void main(String[] args) {
        System.out.println("Starting to calculate ....");
        DateCalculator.calculateDates();
    }

    private static void calculateDates() {
        LocalDate start = LocalDate.of(2022, 1, 1);
        while (true) {
            if (TARGET.equals(calcSum(start))) {
                System.out.println(start);
            }
            start = start.plusDays(1L);
        }
    }

    @VisibleForTesting
    static int calcSum(LocalDate date) {
        if (date == null) {
            return 0;
        }

        return date.getDayOfMonth() + date.getMonthValue() + splitYear(date);

    }

    @VisibleForTesting
    static Integer splitYear(LocalDate date) {
        if (date == null) {
            return 0;
        }

        String year = String.valueOf(date.getYear());
        return Integer.valueOf(year.substring(0, 2)) + Integer.valueOf(year.substring(2, 4));
    }

}
