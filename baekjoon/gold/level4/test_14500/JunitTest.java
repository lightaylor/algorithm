package gold.level4.test_14500;

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
                5 5
                1 2 3 4 5
                5 4 3 2 1
                2 3 4 5 6
                6 5 4 3 2
                1 2 1 2 1
                """;
        String expectedOutput = "19";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                4 5
                1 2 3 4 5
                1 2 3 4 5
                1 2 3 4 5
                1 2 3 4 5
                """;
        String expectedOutput = "20";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                4 10
                1 2 1 2 1 2 1 2 1 2
                2 1 2 1 2 1 2 1 2 1
                1 2 1 2 1 2 1 2 1 2
                2 1 2 1 2 1 2 1 2 1
                """;
        String expectedOutput = "7";

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
