package bronze.level4.test_10156;

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
                300 4 1000
                """;
        String expectedOutput = "200";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws Exception {
        String input = """
                250 2 140
                """;
        String expectedOutput = "360";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws Exception {
        String input = """
                20 6 120
                """;
        String expectedOutput = "0";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws Exception {
        String input = """
                20 10 320
                """;
        String expectedOutput = "0";

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
