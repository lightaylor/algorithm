package gold3.test_16940;

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
                1 2
                1 3
                2 4
                1 2 3 4
                """;
        String expectedOutput = "1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                4
                1 2
                1 3
                2 4
                1 2 4 3
                """;
        String expectedOutput = "0";

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
