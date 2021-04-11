package com.businessdecision;

import org.junit.jupiter.api.Test;

abstract sealed class Shape
        permits Circle, Rectangle {
}

final class Circle extends Shape {
    double radius() {
        return 42.0;
    }
}
final class Rectangle extends Shape {
    double a() {
        return 3.0;
    }
    double b() {
        return 5.0;
    }
}

public class SealedClasses {
    @Test
    void demo() {
        Shape shape = Math.random() > 0.5 ? new Circle() : new Rectangle();
        double area;
        if (shape instanceof Circle c) {
            area = Math.pow(c.radius(), 2) * Math.PI;
        // } else if (shape instanceof Rectangle r) {
        } else {
            Rectangle r = (Rectangle) shape;
            area = r.a() * r.b();
        }
        System.out.println(area);
    }

    @Test
    void demo2() {
        Shape shape = Math.random() > 0.5 ? new Circle() : new Rectangle();
        System.out.println(calculate(shape));
    }

    double calculate(Shape shape) {
        if (shape instanceof Circle c) {
            return Math.pow(c.radius(), 2) * Math.PI;
        } else if (shape instanceof Rectangle r) {
            return r.a() * r.b();
        }
        return 0; // Tja... Sollte laut https://openjdk.java.net/jeps/397 nicht nötig sein.
    }
}