package silver3.test_2606;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static java.lang.System.*;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                7
                6
                1 2
                2 3
                1 5
                5 2
                5 6
                4 7
                """;
        String expectedOutput = "4";
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                5
                4
                1 3
                3 2
                2 5
                5 4
                """;
        String expectedOutput = "4";
        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        setIn(in);
        setOut(new PrintStream(out));

        return stdout.toString();
    }
}
