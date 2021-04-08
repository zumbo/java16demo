package com.businessdecision;

import org.junit.jupiter.api.Test;

enum Day { SUNDAY, MONDAY, TUESDAY,
    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

class SwitchExpressionsTest {
    @Test
    void switchTest() {
        switchTheOldWay(Day.SATURDAY);
    }

    public void switchTheOldWay(Day day) {
        // TODO: Wie lässt sich dieses Switch einfacher schreiben?
        // TODO: Was ist, wenn in einem case mehr als eine Zuweisung gemacht werden soll?
        // Schreibe eine Version, die ein println innerhalb des case aufruft,
        // aber trotzdem eine Switch Expression verwendet.
        int numLetters = 0;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numLetters = 8;
                break;
            case WEDNESDAY:
                numLetters = 9;
                break;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        }
        System.out.println(numLetters);
    }
}
