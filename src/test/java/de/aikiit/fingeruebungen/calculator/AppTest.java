package de.aikiit.fingeruebungen.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void testApp() {
        assertThat(new de.aikiit.App()).isNotNull();
    }
}
