package _00_coding_basics_training.day01.print_a_string;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test() {
        String input = "abcdefg";

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Solution.main(new String[0]);

        System.setIn(stdin);
        System.setOut(new PrintStream(System.out));

        String outputLines = stdout.toString().trim();

        String expectedOutput = input;
        assertEquals(expectedOutput, outputLines);
    }
}
