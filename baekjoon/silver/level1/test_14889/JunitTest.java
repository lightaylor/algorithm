package silver.level1.test_14889;

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
                4
                0 1 2 3
                4 0 5 6
                7 1 0 2
                3 4 5 0
                """;
        String expectedOutput = "0";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                6
                0 1 2 3 4 5
                1 0 2 3 4 5
                1 2 0 3 4 5
                1 2 3 0 4 5
                1 2 3 4 0 5
                1 2 3 4 5 0
                """;
        String expectedOutput = "2";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                8
                0 5 4 5 4 5 4 5
                4 0 5 1 2 3 4 5
                9 8 0 1 2 3 1 2
                9 9 9 0 9 9 9 9
                1 1 1 1 0 1 1 1
                8 7 6 5 4 0 3 2
                9 1 9 1 9 1 0 9
                6 5 4 3 2 1 9 0
                """;
        String expectedOutput = "1";

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
