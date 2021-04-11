package com.businessdecision;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Various {

    public void demo() {
        Stream<Integer> intStream = Stream.of(1, 2, 3);
        // TODO: Wie lässt sich das seit Java 16 vereinfachen?
        // Mit IntelliJ löst sich diese Aufgabe praktisch von alleine...
        List<Integer> listOld = intStream.collect(Collectors.toUnmodifiableList());
    }
}
