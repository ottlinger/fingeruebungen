package de.aikiit;

import de.aikiit.fingeruebungen.calculator.Addierer;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddiererTest {

    @Test
    public void addiereZweiZahlen() {
        String s1 = "42";
        String s2 = "43";
        assertEquals("85", new Addierer(s1, s2).getSumme());
    }

    @Test
    public void addiereWeitereZahlen() {
        //assertEquals("6", new Addierer("a", "b").getSumme());
        assertEquals("6", new Addierer("1", "5").getSumme());
    }
}
