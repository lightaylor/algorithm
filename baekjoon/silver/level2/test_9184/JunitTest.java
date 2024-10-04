package silver.level2.test_9184;

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
                1 1 1
                2 2 2
                10 4 6
                50 50 50
                -1 7 18
                -1 -1 -1""";
        String expectedOutput = """
                w(1, 1, 1) = 2
                w(2, 2, 2) = 4
                w(10, 4, 6) = 523
                w(50, 50, 50) = 1048576
                w(-1, 7, 18) = 1
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                1 1 1
                2 2 2
                10 4 6
                50 50 50
                20 20 19
                21 0 0
                -1 7 18
                1 1 21
                8 20 6
                -1 -1 -1""";
        String expectedOutput = """
                w(1, 1, 1) = 2
                w(2, 2, 2) = 4
                w(10, 4, 6) = 523
                w(50, 50, 50) = 1048576
                w(20, 20, 19) = 1048576
                w(21, 0, 0) = 1
                w(-1, 7, 18) = 1
                w(1, 1, 21) = 1048576
                w(8, 20, 6) = 256
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
