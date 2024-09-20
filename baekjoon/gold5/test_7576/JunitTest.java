package gold5.test_7576;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                6 4
                0 0 0 0 0 0
                0 0 0 0 0 0
                0 0 0 0 0 0
                0 0 0 0 0 1
                """;
        String expectedOutput = "8";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                6 4
                0 -1 0 0 0 0
                -1 0 0 0 0 0
                0 0 0 0 0 0
                0 0 0 0 0 1
                """;
        String expectedOutput = "-1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                6 4
                1 -1 0 0 0 0
                0 -1 0 0 0 0
                0 0 0 0 -1 0
                0 0 0 0 -1 1
                """;
        String expectedOutput = "6";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                5 5
                -1 1 0 0 0
                0 -1 -1 -1 0
                0 -1 -1 -1 0
                0 -1 -1 -1 0
                0 0 0 0 0
                """;
        String expectedOutput = "14";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_5() throws IOException {
        String input = """
                2 2
                1 -1
                -1 1
                """;
        String expectedOutput = "0";

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        return stdout.toString();
    }
}
