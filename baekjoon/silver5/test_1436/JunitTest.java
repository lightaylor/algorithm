package silver5.test_1436;

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
        String input = "2";
        String expectedOutput = "1666";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException, ParseException {
        String input = "3";
        String expectedOutput = "2666";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException, ParseException {
        String input = "6";
        String expectedOutput = "5666";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException, ParseException {
        String input = "187";
        String expectedOutput = "66666";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_5() throws IOException, ParseException {
        String input = "500";
        String expectedOutput = "166699";

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
