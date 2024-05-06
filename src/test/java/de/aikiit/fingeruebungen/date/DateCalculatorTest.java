package de.aikiit.fingeruebungen.date;

import static org.assertj.core.api.Assertions.*;

import java.time.LocalDate;

import org.junit.Test;

public class DateCalculatorTest {

    @Test
    void checkNullSafety() {
        assertThat(DateCalculator.calcSum(null)).isEqualTo(56);
    }

    @Test
    void calculateCorrectValue() {
        assertThat(DateCalculator.calcSum(LocalDate.of(1900, 3, 17))).isEqualTo(56);
    }

}
