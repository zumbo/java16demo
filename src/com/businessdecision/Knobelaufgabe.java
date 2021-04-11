package com.businessdecision;

import org.junit.jupiter.api.Test;

public class Knobelaufgabe {
    @Test
    void test() {
        var animal = Math.random() > 0.5 ? new Pegasus() : new Phoenix();

        animal.doSomethingMythical();
        animal.fly();
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
