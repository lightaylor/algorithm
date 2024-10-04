package silver5.test_1475;

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
        String input = "9999";
        String expectedOutput = "2";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException, ParseException {
        String input = "122";
        String expectedOutput = "2";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException, ParseException {
        String input = "12635";
        String expectedOutput = "1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException, ParseException {
        String input = "888888";
        String expectedOutput = "6";

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
