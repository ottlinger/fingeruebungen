package de.aikiit.fingeruebungen.date;

import static org.assertj.core.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class DateCalculatorTest {

    @Test
    void checkNullSafety() {
        assertThat(DateCalculator.calcSum(LocalDate.of(1900, 3, 17))).isEqualTo(56);
    }

}
