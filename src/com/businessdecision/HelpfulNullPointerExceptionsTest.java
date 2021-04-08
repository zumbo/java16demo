package com.businessdecision;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelpfulNullPointerExceptionsTest {

    @ParameterizedTest
    @ValueSource(strings = {"Zwei"})
    @NullSource
    void demo(String test2) {

        String test1 = "Eins";
        String test3 = "Drei";
        // Was kann in diesem Test schief gehen?
        // Welchen Text erwartest du in der Exception?
        // Führe den Test aus und schaue, ob die Exception so helpful ist wie es die Neuerung in Java 14 verspricht.
        String concat = test1.toLowerCase(Locale.ROOT) + test2.toLowerCase(Locale.ROOT) + test3.toLowerCase(Locale.ROOT);
        assertEquals("einszweidrei", concat);
    }
}