package _00_coding_basics_training.day01.print_the_string_repeatedly;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test() {
        String a = "a";
        int b = 6;
        String expectedOutput = "aaaaaa";

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream((a + "\n" + b).getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));
        Solution.main(new String[0]);
        String outputLines = stdout.toString().trim();

        assertEquals(expectedOutput, outputLines);
    }
}
