package baekjoon.test_19587;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() {
        String input = "1";
        String expectedOutput = "3";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() {
        String input = "2";
        String expectedOutput = "7";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() {
        String input = "3";
        String expectedOutput = "17";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() {
        String input = "4";
        String expectedOutput = "41";

        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_5() {
        String input = "5";
        String expectedOutput = "99";

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) {
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
