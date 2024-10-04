package silver.level5.test_1193;

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
        String input = "1";
        String expectedOutput = "1/1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException, ParseException {
        String input = "2";
        String expectedOutput = "1/2";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException, ParseException {
        String input = "3";
        String expectedOutput = "2/1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException, ParseException {
        String input = "4";
        String expectedOutput = "3/1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_5() throws IOException, ParseException {
        String input = "5";
        String expectedOutput = "2/2";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_6() throws IOException, ParseException {
        String input = "6";
        String expectedOutput = "1/3";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_7() throws IOException, ParseException {
        String input = "7";
        String expectedOutput = "1/4";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_8() throws IOException, ParseException {
        String input = "8";
        String expectedOutput = "2/3";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_9() throws IOException, ParseException {
        String input = "9";
        String expectedOutput = "3/2";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_14() throws IOException, ParseException {
        String input = "14";
        String expectedOutput = "2/4";

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
