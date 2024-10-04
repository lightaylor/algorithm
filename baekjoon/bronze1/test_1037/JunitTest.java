package bronze1.test_1037;

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
        String input = """
                2
                4 2
                """;
        String expectedOutput = "8";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                1
                2
                """;
        String expectedOutput = "4";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                6
                3 4 2 12 6 8
                """;
        String expectedOutput = "24";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                14
                14 26456 2 28 13228 3307 7 23149 8 6614 46298 56 4 92596
                """;
        String expectedOutput = "185192";

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
