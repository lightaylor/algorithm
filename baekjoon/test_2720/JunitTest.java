package test_2720;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static java.lang.System.*;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input =
                "3\n" +
                "124\n" +
                "25\n" +
                "194";
        String expectedOutput =
                "4 2 0 4\n" +
                "1 0 0 0\n" +
                "7 1 1 4\n";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input =
                "5\n" +
                "500\n" +
                "499\n" +
                "498\n" +
                "497\n" +
                "496";
        String expectedOutput =
                "20 0 0 0\n" +
                "19 2 0 4\n" +
                "19 2 0 3\n" +
                "19 2 0 2\n" +
                "19 2 0 1\n";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input =
                "2\n" +
                "15\n" +
                "35";
        String expectedOutput =
                "0 1 1 0\n" +
                "1 1 0 0\n";

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        setIn(in);
        setOut(new PrintStream(out));

        return stdout.toString();
    }
}
