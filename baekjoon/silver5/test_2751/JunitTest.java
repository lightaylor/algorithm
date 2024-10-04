package silver5.test_2751;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input =
                "5\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1";
        String expectedOutput =
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        String actualOutput = stdout.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}
