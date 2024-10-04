package bronze1.test_10798;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "ABCDE\n" +
                "abcde\n" +
                "01234\n" +
                "FGHIJ\n" +
                "fghij";
        String expectedOutput = "Aa0FfBb1GgCc2HhDd3IiEe4Jj";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = "AABCDD\n" +
                "afzz\n" +
                "09121\n" +
                "a8EWg6\n" +
                "P5h3kx";
        String expectedOutput = "Aa0aPAf985Bz1EhCz2W3D1gkD6x";

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        return stdout.toString();
    }
}
