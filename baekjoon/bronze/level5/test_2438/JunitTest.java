package bronze.level5.test_2438;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "5";
        String expectedOutput =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(System.out);

        assertEquals(expectedOutput, output.toString());
    }
}
