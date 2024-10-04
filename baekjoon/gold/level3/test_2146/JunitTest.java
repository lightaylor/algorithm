package gold.level3.test_2146;

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
                10
                1 1 1 0 0 0 0 1 1 1
                1 1 1 1 0 0 0 0 1 1
                1 0 1 1 0 0 0 0 1 1
                0 0 1 1 1 0 0 0 0 1
                0 0 0 1 0 0 0 0 0 1
                0 0 0 0 0 0 0 0 0 1
                0 0 0 0 0 0 0 0 0 0
                0 0 0 0 1 1 0 0 0 0
                0 0 0 0 1 1 1 0 0 0
                0 0 0 0 0 0 0 0 0 0
                """;
        String expectedOutput = "3";

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
