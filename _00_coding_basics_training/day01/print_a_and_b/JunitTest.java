package _00_coding_basics_training.day01.print_a_and_b;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test() {
        int a = 1;
        int b = 2;

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream((a + "\n" + b).getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Solution.main(new String[0]);

        System.setIn(stdin);
        System.setOut(new PrintStream(System.out));

        String[] outputLines = stdout.toString().trim().split("\\r?\\n");

        String[] expectedOutput = {"a = " + a, "b = " + b};
        assertEquals(expectedOutput.length, outputLines.length);

        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], outputLines[i]);
        }
    }
}
