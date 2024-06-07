package test_9506;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "6\n" +
                "12\n" +
                "28\n" +
                "-1";
        String expectedOutput = "6 = 1 + 2 + 3\n" +
                "12 is NOT perfect.\n" +
                "28 = 1 + 2 + 4 + 7 + 14\n";

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
