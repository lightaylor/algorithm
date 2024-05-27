package test_1018;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "8 8\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBBBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW";
        String expectedOutput = "1";
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_2() throws IOException {
        String input = "10 13\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "BBBBBBBBWBWBW\n" +
                "BBBBBBBBBWBWB\n" +
                "WWWWWWWWWWBWB\n" +
                "WWWWWWWWWWBWB";
        String expectedOutput = "12";
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_3() throws IOException {
        String input = "8 8\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB";
        String expectedOutput = "0";
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_4() throws IOException {
        String input = "9 23\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBW";
        String expectedOutput = "31";
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_5() throws IOException {
        String input = "10 10\n" +
                "BBBBBBBBBB\n" +
                "BBWBWBWBWB\n" +
                "BWBWBWBWBB\n" +
                "BBWBWBWBWB\n" +
                "BWBWBWBWBB\n" +
                "BBWBWBWBWB\n" +
                "BWBWBWBWBB\n" +
                "BBWBWBWBWB\n" +
                "BWBWBWBWBB\n" +
                "BBBBBBBBBB";
        String expectedOutput = "0";
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_6() throws IOException {
        String input = "8 8\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWBWB\n" +
                "BWBBBWBW\n" +
                "WBWBWBWB\n" +
                "BWBWBWBW\n" +
                "WBWBWWWB\n" +
                "BWBWBWBW";
        String expectedOutput = "2";
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_7() throws IOException {
        String input = "11 12\n" +
                "BWWBWWBWWBWW\n" +
                "BWWBWBBWWBWW\n" +
                "WBWWBWBBWWBW\n" +
                "BWWBWBBWWBWW\n" +
                "WBWWBWBBWWBW\n" +
                "BWWBWBBWWBWW\n" +
                "WBWWBWBBWWBW\n" +
                "BWWBWBWWWBWW\n" +
                "WBWWBWBBWWBW\n" +
                "BWWBWBBWWBWW\n" +
                "WBWWBWBBWWBW";
        String expectedOutput = "15";
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_8() throws IOException {
        String input = "9 19\n" +
                "BBBBBBBBBBBBBBBBBBB\n" +
                "BWWBWBWBWBBBBBBBBBB\n" +
                "BWBWBWBWBWBBBBBBBBB\n" +
                "BWWBWBWBWBBBBBBBBBB\n" +
                "BWBWBBBWBWBBWBWBWBW\n" +
                "BWWBWBWBWBBBBBBBBBB\n" +
                "BWBWBWBWBWBBBBBBBBB\n" +
                "BWWBWBWBWBBBBBBBBBB\n" +
                "BWBWBWBWBWBBBBBBBBB";
        String expectedOutput = "1";
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_9() throws IOException {
        String input = "8 16\n" +
                "WWWWWWWWWWWWWWWW\n" +
                "BWBWBWBWBWBWBWBW\n" +
                "WBWBWBWBWBWBWBWB\n" +
                "BWBWBWBWBWBWBWBW\n" +
                "WBWBWBWBWBWBWBWB\n" +
                "BWBWBWBWBWBWBWBW\n" +
                "WBWBWBWBWBWBWBWB\n" +
                "BWBWBWBWBWBWBWBW";
        String expectedOutput = "4";
        assertEquals(expectedOutput, test(input));
    }

    @Test
    public void test_10() throws IOException {
        String input = "8 8\n" +
                "BWBWBWBW\n" +
                "BWBWBWBW\n" +
                "BWBWBWBW\n" +
                "BWBWBWBW\n" +
                "BWBWBWBW\n" +
                "BWBWBWBW\n" +
                "BWBWBWBW\n" +
                "BWBWBWBW";
        String expectedOutput = "32";
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
