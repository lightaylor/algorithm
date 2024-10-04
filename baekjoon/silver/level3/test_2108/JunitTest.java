package silver.level3.test_2108;

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
                5
                1
                3
                8
                -2
                2
                """;
        String expectedOutput = """
                2
                2
                1
                10
                """;
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                1
                4000
                """;
        String expectedOutput = """
                4000
                4000
                4000
                0
                """;
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                5
                -1
                -2
                -3
                -1
                -2
                """;
        String expectedOutput = """
                -2
                -2
                -1
                2
                """;
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                3
                0
                0
                -1
                """;
        String expectedOutput = """
                0
                0
                0
                1
                """;
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_5() throws IOException {
        String input = """
                5
                -4000
                0
                1
                2
                3
                """;
        String expectedOutput = """
                -799
                1
                0
                4003
                """;
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_6() throws IOException {
        String input = """
                3
                -4000
                4000
                0
                """;
        String expectedOutput = """
                0
                0
                0
                8000
                """;
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_7() throws IOException {
        String input = """
                3
                0
                -1
                -1
                """;
        String expectedOutput = """
                -1
                -1
                -1
                1
                """;
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
