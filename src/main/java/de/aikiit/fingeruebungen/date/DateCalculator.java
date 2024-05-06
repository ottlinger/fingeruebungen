package de.aikiit.fingeruebungen.date;

import java.time.LocalDate;

import com.google.common.annotations.VisibleForTesting;

public class DateCalculator {

    static final Integer TARGET = Integer.valueOf(68);
    static final Integer STOP_YEAR = 2027;

    public static void main(String[] args) {
        System.out.println("Starting to calculate special dates from today ....");
        DateCalculator.calculateDates();
    }

    private static void calculateDates() {
        LocalDate start = LocalDate.now();
        while (start.getYear() <= STOP_YEAR) {
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
