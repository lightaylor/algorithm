package test_1316;

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
        String input = "3\n" +
                "happy\n" +
                "new\n" +
                "year";
        String expectedOutput = "3";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException, ParseException {
        String input = "4\n" +
                "aba\n" +
                "abab\n" +
                "abcabc\n" +
                "a";
        String expectedOutput = "1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException, ParseException {
        String input = "5\n" +
                "ab\n" +
                "aa\n" +
                "aca\n" +
                "ba\n" +
                "bb";
        String expectedOutput = "4";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException, ParseException {
        String input = "1\n" +
                "z";
        String expectedOutput = "1";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_5() throws IOException, ParseException {
        String input = "9\n" +
                "aaa\n" +
                "aaazbz\n" +
                "babb\n" +
                "aazz\n" +
                "azbz\n" +
                "aabbaa\n" +
                "abacc\n" +
                "aba\n" +
                "zzaz";
        String expectedOutput = "2";

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
