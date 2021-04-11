package com.businessdecision;

import org.junit.jupiter.api.Test;

public class Knobelaufgabe {
    @Test
    void test() {
        Object animal = Math.random() > 0.5 ? new Pegasus() : new Phoenix();
        // TODO: Bringe die zwei nachfolgenden Aufrufe zum funktionieren, und zwar ohne die Typ-Hierarchie zu ändern,
        // und auch nicht die Aufrufe (ausser natürlich dem Entfernen der Kommentarzeichen).
        // Hint: In TypeScript würde man hier einen Union Type verwenden, aber das gibt es ja in Java nicht, oder??

        // animal.doSomethingMythical();
        // animal.fly();
    }
}

interface MythicalAnimal {
    void doSomethingMythical();
}

interface FlyingAnimal {
    void fly();
}

class Pegasus implements MythicalAnimal, FlyingAnimal {

    @Override
    public void doSomethingMythical() {
        System.out.println("Form out of sea foam.");
    }

    @Override
    public void fly() {
        System.out.println("Rise into the air.");
    }
}

class Phoenix implements MythicalAnimal, FlyingAnimal {

    @Override
    public void doSomethingMythical() {
        System.out.println("Rise out of the ashes.");
    }

    @Override
    public void fly() {
        System.out.println("Fly out of the ashes into the air.");
    }
}
