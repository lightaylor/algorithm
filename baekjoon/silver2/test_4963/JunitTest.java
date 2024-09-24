package silver2.test_4963;

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
                1 1
                0
                2 2
                0 1
                1 0
                3 2
                1 1 1
                1 1 1
                5 4
                1 0 1 0 0
                1 0 0 0 0
                1 0 1 0 1
                1 0 0 1 0
                5 4
                1 1 1 0 1
                1 0 1 0 1
                1 0 1 0 1
                1 0 1 1 1
                5 5
                1 0 1 0 1
                0 0 0 0 0
                1 0 1 0 1
                0 0 0 0 0
                1 0 1 0 1
                0 0
                """;
        String expectedOutput = """
                0
                1
                1
                3
                1
                9
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
