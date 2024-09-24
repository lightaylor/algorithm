package gold3.test_14391;

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
                2 3
                123
                312
                """;
        String expectedOutput = "435";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                2 2
                99
                11
                """;
        String expectedOutput = "182";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                4 3
                001
                010
                111
                100
                """;
        String expectedOutput = "1131";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                1 1
                8
                """;
        String expectedOutput = "8";

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
