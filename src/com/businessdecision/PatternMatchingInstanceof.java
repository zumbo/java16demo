package com.businessdecision;

public class PatternMatchingInstanceof {

    public interface Shape {
        public static double getPerimeterOld(Shape shape) throws IllegalArgumentException {
            // TODO: Wie lässt sich dieser Code in Java 16 einfacher schreiben?
            if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                return 2 * r.length() + 2 * r.width();
            } else if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                return 2 * c.radius() * Math.PI;
            } else {
                throw new IllegalArgumentException("Unrecognized shape");
            }
        }
    }

    public static class Rectangle implements Shape {
        final double length;
        final double width;
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        double length() { return length; }
        double width() { return width; }
    }

    public static class Circle implements Shape {
        final double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        double radius() { return radius; }
    }
}
