package baekjoon.test_15841;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "1\n4\n6\n11\n-1";
        String expectedOutput = "Hour 1: 1 cow(s) affected\nHour 4: 3 cow(s) affected\nHour 6: 8 cow(s) affected\nHour 11: 89 cow(s) affected";

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(stdin);
        System.setOut(new PrintStream(System.out));

        String actualOutput = stdout.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}
