package test_27323;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "2\n" +
                "3";
        String expectedOutput = "6";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = "100\n1";
        String expectedOutput = "100";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = "4\n" +
                "4";
        String expectedOutput = "16";

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(stdin);
        System.setOut(new PrintStream(System.out));

        return stdout.toString();
    }
}
