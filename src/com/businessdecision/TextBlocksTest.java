package com.businessdecision;

import org.junit.jupiter.api.Test;

class TextBlocksTest {

    @Test
    void demoAlt() {
        String html = "<html>\n" +
                      "    <body>\n" +
                      "        <p>Hello World.</p>\n" +
                      "    </body>\n" +
                      "</html>\n";
        System.out.println(html);
    }

    // TODO: Schreibe diese Textausgabe mit Textblocks.
    // Welche Möglichkeiten gibt es, den Quellcode (bei gleichbleibendem Outputtext) zu formatieren?
    // Was schlägt die Standardformatierung von IntelliJ (Ctrl-Alt-L) vor?
    // TODO: Schreibe die gleiche Textausgabe, aber um vier Leerzeichen eingerückt.
    // Wie hilft IntelliJ dabei, die Einrückung sichtbar zu machen?
    // TODO: Schreibe die gleiche Textausgabe, aber um vier Leerzeichen eingerückt *und* ohne abschliessenden Zeilenumbruch.
    // Was passiert, wenn man in der Einrückung Spaces und Tabs mischt? (IntelliJ macht einem das [zu recht] schwer.)

    @Test
    void demo1() {
        String html = """
<html>
    <body>
        <p>Hello World.</p>
    </body>
</html>
""";
        System.out.println(html);
    }

    @Test
    void demo2() {
        String html = """
                    <html>
                        <body>
                            <p>Hello World.</p>
                        </body>
                    </html>
                """;
        System.out.println(html);
    }

    @Test
    void demo3() {
        String html = """
                <html>
                    <body>
                        <p>Hello World.</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }

    @Test
    void aufgabe() {
        String test = """
                Lorem 
                ipsum
                dolor
                sit
                amet""";
        System.out.println(test);
    }

    @Test
    void lösung() {
        String test = """
                Lorem 
                ipsum
                dolor
                sit
                amet""".indent(4);
        System.out.println(test);
    }

    // Aufgabe: Trailing whitespace

    // Do not mix with tabs!
}

