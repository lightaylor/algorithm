package test_1003;

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
        String input = "3\n0\n1\n3";
        String expectedOutput = "1 0\n0 1\n1 2\n";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = "2\n6\n22";
        String expectedOutput = "5 8\n10946 17711\n";

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
