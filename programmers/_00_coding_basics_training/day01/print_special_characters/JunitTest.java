package _00_coding_basics_training.day01.print_special_characters;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test() {
        String expectedOutput = "!@#$%^&*(\\'\"<>?:;";

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));
        Solution.main(new String[0]);
        String outputLines = stdout.toString().trim();

        assertEquals(expectedOutput, outputLines);
    }
}
