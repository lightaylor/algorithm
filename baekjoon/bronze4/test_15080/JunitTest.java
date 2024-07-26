package bronze4.test_15080;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.*;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws Exception {
        String input = """
                10 : 0 : 0
                11 : 0 : 0
                """;
        String expectedOutput = "3600";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws Exception {
        String input = """
                13 : 30 : 52
                13 : 31 : 7
                """;
        String expectedOutput = "15";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws Exception {
        String input = """
                23 : 0 : 0
                1 : 30 : 0
                """;
        String expectedOutput = "9000";

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws Exception {
        setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        setIn(in);
        setOut(new PrintStream(out));

        return stdout.toString();
    }
}
