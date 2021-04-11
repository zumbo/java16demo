package com.businessdecision;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RecordsTest {
    @Test
    void classicTest() {
        RectangleClassic rec = new RectangleClassic(3.0, 5.0);
        assertEquals(15.0, rec.area(), 0.001);

        RectangleClassic square = new RectangleClassic(4.0);
        assertEquals(4.0, square.length(), 0.001);
        assertEquals(4.0, square.width(), 0.001);
        assertEquals(16.0, square.area(), 0.001);
    }

    @Test
    void recordTest() {
        RectangleRecord rec = new RectangleRecord(3.0, 5.0);
        assertEquals(15.0, rec.area(), 0.001);

        RectangleRecord square = new RectangleRecord(4.0);
        assertEquals(4.0, square.length(), 0.001);
        assertEquals(4.0, square.width(), 0.001);
        assertEquals(16.0, square.area(), 0.001);
    }
}

record RectangleRecord(double length, double width) {
    RectangleRecord(double length) {
        this(length, length);
    }
    double area() {
        return length * width;
    }
}

final class RectangleClassic {
    private final double length;
    private final double width;

    public RectangleClassic(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Construct a square.
    public RectangleClassic(double length) {
        this.length = length;
        this.width = length;
    }

    double length() {
        return this.length;
    }

    double width() {
        return this.width;
    }

    double area() {
        return length * width;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangleClassic rectangleClassic = (RectangleClassic) o;
        return Double.compare(rectangleClassic.length, length) == 0 && Double.compare(rectangleClassic.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
