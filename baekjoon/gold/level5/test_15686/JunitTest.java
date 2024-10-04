package gold.level5.test_15686;

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
                5 3
                0 0 1 0 0
                0 0 2 0 1
                0 1 2 0 0
                0 0 1 0 0
                0 0 0 0 2
                """;
        String expectedOutput = "5";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                5 2
                0 2 0 1 0
                1 0 1 0 0
                0 0 0 0 0
                2 0 0 1 1
                2 2 0 1 2
                """;
        String expectedOutput = "10";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                5 1
                1 2 0 0 0
                1 2 0 0 0
                1 2 0 0 0
                1 2 0 0 0
                1 2 0 0 0
                """;
        String expectedOutput = "11";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                5 1
                1 2 0 2 1
                1 2 0 2 1
                1 2 0 2 1
                1 2 0 2 1
                1 2 0 2 1
                """;
        String expectedOutput = "32";

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
