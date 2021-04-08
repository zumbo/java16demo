package com.businessdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarningsForValueBasedClassesTest {
    final Integer integerField = 3;
    @Test
    public void demo() {
        // Was löst hier alles Warnungen aus?
        Integer integerA = new Integer(3);
        Integer integerB = new Integer(3);

        // Dieses Verhalten könnte sich in Zukunft ändern!
        assertFalse(integerA == integerB);

        synchronized (integerField) {

        }
    }
}
