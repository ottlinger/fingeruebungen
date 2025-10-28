package de.aikiit.fingeruebungen.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddiererTest {

    @Test
    public void addiereZweiZahlen() {
        String s1 = "42";
        String s2 = "43";
        assertEquals("85.0", new Addierer(s1, s2).getSumme());
    }

    @Test
    public void addiereWeitereZahlen() {
        assertEquals("6.0", new Addierer("1", "5").getSumme());
    }

    @Test
    public void isNumeric_withNumbers() {
        assertTrue(new Addierer("6", "5").isNumeric());
    }

    @Test
    public void isNumeric_withLetters() {
        assertFalse(new Addierer("a", "5").isNumeric());
        assertFalse(new Addierer("54", "b").isNumeric());
        assertFalse(new Addierer("only", "me").isNumeric());
    }

    @Test
    public void addiereSchrott() {
        assertEquals("Du hast Quatsch eingegeben", new Addierer("Quatsch", "1").getSumme());
    }
}
