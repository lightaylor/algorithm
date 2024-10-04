package gold.level5.test_13023;

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
                5 4
                0 1
                1 2
                2 3
                3 4
                """;
        String expectedOutput = "1";

        assertEquals(expectedOutput, test(input));
    }


    @Test
    public void test_2() throws IOException {
        String input = """
                5 5
                0 1
                1 2
                2 3
                3 0
                1 4
                """;
        String expectedOutput = "1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                6 5
                0 1
                0 2
                0 3
                0 4
                0 5
                """;
        String expectedOutput = "0";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                8 8
                1 7
                3 7
                4 7
                3 4
                4 6
                3 5
                0 4
                2 7
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
