package baekjoon.test_1009;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "5\n1 6\n3 7\n6 2\n7 100\n9 635";
        String expectedOutput = "1\n7\n6\n1\n9\n";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = "3\n4 4\n5 0\n10 1";
        String expectedOutput = "6\n1\n10\n";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = "8\n10 11\n4 7\n10 2\n20 1\n4 2\n2 3\n98 5\n99 999999";
        String expectedOutput = "10\n4\n10\n10\n6\n8\n8\n9\n";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = "1\n100 2";
        String expectedOutput = "10\n";

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
