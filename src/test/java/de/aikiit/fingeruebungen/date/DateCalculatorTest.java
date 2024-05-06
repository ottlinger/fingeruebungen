package de.aikiit.fingeruebungen.date;

import static org.assertj.core.api.Assertions.*;
import static de.aikiit.fingeruebungen.date.DateCalculator.*;

import java.time.LocalDate;

import org.junit.Test;

public class DateCalculatorTest {

    @Test
    public void checkNullSafety() {
        assertThat(calcSum(null)).isEqualTo(0);
    }

    @Test
    public void calculateCorrectValue() {
        assertThat(calcSum(LocalDate.of(2022, 2, 24))).isEqualTo(TARGET);
    }

    @Test
    public void checkNullSafetyYearExtraction() {
        assertThat(splitYear(null)).isEqualTo(0);
    }

    @Test
    public void checkYearExtraction() {
        assertThat(splitYear(LocalDate.of(1901, 1, 17))).isEqualTo(19+1);
    }

}
