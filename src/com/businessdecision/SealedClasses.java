package com.businessdecision;

// - Untersuche die folgende Klassenhierarchie.
//   Was passiert, wenn eine Klasse aus der permits-Klausel entfernt wird?
// - Was passiert, wenn das final von Circle oder das non-sealed von Square entfernt wird?
// - Wenn (s instanceof Shape) == true, ist dann in jedem Fall auch
//   (s instanceof Circle || s instanceof Square || s instanceof Rectangle) == true?
//   (Hint: ja, falls noch eine kleine Änderung an Shape gemacht wird.)
// - Vorausgesetzt, untenstehender Code wird nicht verändert (und auch nicht per Reflection manipuliert):
//   Ist dann garantiert, dass niemand diese Klassenhierarchie erweitert?
// - Was passiert, wenn eine der Klassen in eine andere Datei verschoben wird?
// - Was passiert, wenn eine der Klassen in ein anderes Package verschoben wird?

sealed class Shape
        permits Circle, Square, Rectangle {
}

final class Circle extends Shape {
    public float radius;
}

non-sealed class Square extends Shape {
    public double side;
}

sealed class Rectangle extends Shape permits FilledRectangle {
    public double length, width;
}

final class FilledRectangle extends Rectangle {
    public int red, green, blue;
}

// TODO:
// Schaue den Beispielcode zu Sealed Classes unter
// https://advancedweb.hu/a-categorized-list-of-all-java-and-jvm-features-since-jdk-8-to-16/
// an. Schaffst du es, ihn zum Laufen zu bringen?
// Hint: Es wird an mehr als einer (oder zwei...) Stellen klemmen.
