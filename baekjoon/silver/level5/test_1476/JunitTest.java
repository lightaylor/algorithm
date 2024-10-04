package silver.level5.test_1476;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;

import static java.lang.System.*;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException, ParseException {
        String input = "1 16 16";
        String expectedOutput = "16";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException, ParseException {
        String input = "1 1 1";
        String expectedOutput = "1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException, ParseException {
        String input = "1 2 3";
        String expectedOutput = "5266";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException, ParseException {
        String input = "15 28 19";
        String expectedOutput = "7980";

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException, ParseException {
        setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        setIn(in);
        setOut(new PrintStream(out));

        return stdout.toString();
    }
}
