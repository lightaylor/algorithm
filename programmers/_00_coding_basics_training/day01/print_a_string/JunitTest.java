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
        String expectedOutput = "abcdefg";

        System.setIn(new ByteArrayInputStream(expectedOutput.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Solution.main(new String[0]);

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        String outputLines = stdout.toString().trim();

        assertEquals(expectedOutput, outputLines);
    }
}
