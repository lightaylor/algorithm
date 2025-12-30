package gold.level4.test_17404;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            3
            26 40 83
            49 60 57
            13 89 99
            """;
        String expectedOutput = "110";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            3
            1 100 100
            100 1 100
            100 100 1
            """;
        String expectedOutput = "3";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            3
            1 100 100
            100 100 100
            1 100 100
            """;
        String expectedOutput = "201";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            6
            30 19 5
            64 77 64
            15 19 97
            4 71 57
            90 86 84
            93 32 91
            """;
        String expectedOutput = "208";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = """
            8
            71 39 44
            32 83 55
            51 37 63
            89 29 100
            83 58 11
            65 13 15
            47 25 29
            60 66 19
            """;
        String expectedOutput = "253";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
