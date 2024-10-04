package silver.level2.test_11725;

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
                7
                1 6
                6 3
                3 5
                4 1
                2 4
                4 7
                """;
        String expectedOutput = """
                4
                6
                1
                3
                1
                4
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                12
                1 2
                1 3
                2 4
                3 5
                3 6
                4 7
                4 8
                5 9
                5 10
                6 11
                6 12
                """;
        String expectedOutput = """
                1
                1
                2
                3
                3
                4
                4
                5
                5
                6
                6
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                10
                1 3
                5 4
                3 2
                2 7
                5 7
                9 10
                5 10
                6 8
                1 6
                """;
        String expectedOutput = """
                3
                1
                5
                7
                1
                2
                6
                10
                5
                """;

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
