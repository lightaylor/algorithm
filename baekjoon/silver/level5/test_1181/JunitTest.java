package silver.level5.test_1181;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input =
                "13\n" +
                "but\n" +
                "i\n" +
                "wont\n" +
                "hesitate\n" +
                "no\n" +
                "more\n" +
                "no\n" +
                "more\n" +
                "it\n" +
                "cannot\n" +
                "wait\n" +
                "im\n" +
                "yours";
        String expectedOutput =
                "i\n" +
                "im\n" +
                "it\n" +
                "no\n" +
                "but\n" +
                "more\n" +
                "wait\n" +
                "wont\n" +
                "yours\n" +
                "cannot\n" +
                "hesitate\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        String actualOutput = stdout.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}
