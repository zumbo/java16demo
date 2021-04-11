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

    @Test
    void demoOhneInputWhitespace() {
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
    void demoMitInputWhitespace() {
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
    void demoEingerückt() {
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
    void demoEingerücktOhneAbschliessendesNewline() {
        String html = """
                    <html>
                        <body>
                            <p>Hello World.</p>
                        </body>
                    </html>""".indent(4);
        System.out.println(html);
    }
}

