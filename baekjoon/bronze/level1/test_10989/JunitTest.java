package bronze.level1.test_10989;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "10\n" +
                "5\n" +
                "2\n" +
                "3\n" +
                "1\n" +
                "4\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "1\n" +
                "7";
        String expectedOutput = "1\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "3\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "5\n" +
                "7\n";

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
