package test_2501;

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
        String input = "6 3";
        String expectedOutput = "3";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException, ParseException {
        String input = "25 4";
        String expectedOutput = "0";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException, ParseException {
        String input = "2735 1";
        String expectedOutput = "1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException, ParseException {
        String input = "1 1";
        String expectedOutput = "1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_5() throws IOException, ParseException {
        String input = "11 3";
        String expectedOutput = "0";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_6() throws IOException, ParseException {
        String input = "9 3";
        String expectedOutput = "9";

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
