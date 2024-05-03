package baekjoon.test_1010;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "3\n2 2\n1 5\n13 29";
        String expectedOutput = "1\n5\n67863915\n";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = "3\n2 3\n2 4\n2 5";
        String expectedOutput = "3\n6\n10\n";

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
