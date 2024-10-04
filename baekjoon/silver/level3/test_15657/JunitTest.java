package silver.level3.test_15657;

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
                3 1
                4 5 2
                """;
        String expectedOutput = """
                2
                4
                5
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                4 2
                9 8 7 1
                """;
        String expectedOutput = """
                1 1
                1 7
                1 8
                1 9
                7 7
                7 8
                7 9
                8 8
                8 9
                9 9
                """;

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                4 4
                1231 1232 1233 1234
                """;
        String expectedOutput = """
                1231 1231 1231 1231
                1231 1231 1231 1232
                1231 1231 1231 1233
                1231 1231 1231 1234
                1231 1231 1232 1232
                1231 1231 1232 1233
                1231 1231 1232 1234
                1231 1231 1233 1233
                1231 1231 1233 1234
                1231 1231 1234 1234
                1231 1232 1232 1232
                1231 1232 1232 1233
                1231 1232 1232 1234
                1231 1232 1233 1233
                1231 1232 1233 1234
                1231 1232 1234 1234
                1231 1233 1233 1233
                1231 1233 1233 1234
                1231 1233 1234 1234
                1231 1234 1234 1234
                1232 1232 1232 1232
                1232 1232 1232 1233
                1232 1232 1232 1234
                1232 1232 1233 1233
                1232 1232 1233 1234
                1232 1232 1234 1234
                1232 1233 1233 1233
                1232 1233 1233 1234
                1232 1233 1234 1234
                1232 1234 1234 1234
                1233 1233 1233 1233
                1233 1233 1233 1234
                1233 1233 1234 1234
                1233 1234 1234 1234
                1234 1234 1234 1234
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
