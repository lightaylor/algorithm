package baekjoon.silver.level4.test_1018;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            8 8
            WBWBWBWB
            BWBWBWBW
            WBWBWBWB
            BWBBBWBW
            WBWBWBWB
            BWBWBWBW
            WBWBWBWB
            BWBWBWBW
            """;
        String expectedOutput = "1";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """ 
            10 13
            BBBBBBBBWBWBW
            BBBBBBBBBWBWB
            BBBBBBBBWBWBW
            BBBBBBBBBWBWB
            BBBBBBBBWBWBW
            BBBBBBBBBWBWB
            BBBBBBBBWBWBW
            BBBBBBBBBWBWB
            WWWWWWWWWWBWB
            WWWWWWWWWWBWB
            """;
        String expectedOutput = "12";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            8 8
            BWBWBWBW
            WBWBWBWB
            BWBWBWBW
            WBWBWBWB
            BWBWBWBW
            WBWBWBWB
            BWBWBWBW
            WBWBWBWB
            """;
        String expectedOutput = "0";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            9 23
            BBBBBBBBBBBBBBBBBBBBBBB
            BBBBBBBBBBBBBBBBBBBBBBB
            BBBBBBBBBBBBBBBBBBBBBBB
            BBBBBBBBBBBBBBBBBBBBBBB
            BBBBBBBBBBBBBBBBBBBBBBB
            BBBBBBBBBBBBBBBBBBBBBBB
            BBBBBBBBBBBBBBBBBBBBBBB
            BBBBBBBBBBBBBBBBBBBBBBB
            BBBBBBBBBBBBBBBBBBBBBBW
            """;
        String expectedOutput = "31";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = """
            10 10
            BBBBBBBBBB
            BBWBWBWBWB
            BWBWBWBWBB
            BBWBWBWBWB
            BWBWBWBWBB
            BBWBWBWBWB
            BWBWBWBWBB
            BBWBWBWBWB
            BWBWBWBWBB
            BBBBBBBBBB
            """;
        String expectedOutput = "0";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_6() throws IOException {
        String input = """
            8 8
            WBWBWBWB
            BWBWBWBW
            WBWBWBWB
            BWBBBWBW
            WBWBWBWB
            BWBWBWBW
            WBWBWWWB
            BWBWBWBW
            """;
        String expectedOutput = "2";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_7() throws IOException {
        String input = """
            11 12
            BWWBWWBWWBWW
            BWWBWBBWWBWW
            WBWWBWBBWWBW
            BWWBWBBWWBWW
            WBWWBWBBWWBW
            BWWBWBBWWBWW
            WBWWBWBBWWBW
            BWWBWBWWWBWW
            WBWWBWBBWWBW
            BWWBWBBWWBWW
            WBWWBWBBWWBW
            """;
        String expectedOutput = "15";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_8() throws IOException {
        String input = """
            9 19
            BBBBBBBBBBBBBBBBBBB
            BWWBWBWBWBBBBBBBBBB
            BWBWBWBWBWBBBBBBBBB
            BWWBWBWBWBBBBBBBBBB
            BWBWBBBWBWBBWBWBWBW
            BWWBWBWBWBBBBBBBBBB
            BWBWBWBWBWBBBBBBBBB
            BWWBWBWBWBBBBBBBBBB
            BWBWBWBWBWBBBBBBBBB
            """;
        String expectedOutput = "1";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_9() throws IOException {
        String input = """
            8 16
            WWWWWWWWWWWWWWWW
            BWBWBWBWBWBWBWBW
            WBWBWBWBWBWBWBWB
            BWBWBWBWBWBWBWBW
            WBWBWBWBWBWBWBWB
            BWBWBWBWBWBWBWBW
            WBWBWBWBWBWBWBWB
            BWBWBWBWBWBWBWBW
            """;
        String expectedOutput = "4";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_10() throws IOException {
        String input = """
            8 8
            BWBWBWBW
            BWBWBWBW
            BWBWBWBW
            BWBWBWBW
            BWBWBWBW
            BWBWBWBW
            BWBWBWBW
            BWBWBWBW
            """;
        String expectedOutput = "32";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
