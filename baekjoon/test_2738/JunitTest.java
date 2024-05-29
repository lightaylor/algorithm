package test_2738;

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
        String input =
                "3 3\n" +
                "1 1 1\n" +
                "2 2 2\n" +
                "0 1 0\n" +
                "3 3 3\n" +
                "4 4 4\n" +
                "5 5 100";
        String expectedOutput =
                "4 4 4 \n" +
                "6 6 6 \n" +
                "5 6 100 \n";

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
