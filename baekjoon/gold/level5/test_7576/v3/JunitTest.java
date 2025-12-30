package gold.level5.test_7576.v3;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            6 4
            0 0 0 0 0 0
            0 0 0 0 0 0
            0 0 0 0 0 0
            0 0 0 0 0 1
            """;
        String expectedOutput = "8";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            6 4
            0 -1 0 0 0 0
            -1 0 0 0 0 0
            0 0 0 0 0 0
            0 0 0 0 0 1
            """;
        String expectedOutput = "-1";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            6 4
            1 -1 0 0 0 0
            0 -1 0 0 0 0
            0 0 0 0 -1 0
            0 0 0 0 -1 1
            """;
        String expectedOutput = "6";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            5 5
            -1 1 0 0 0
            0 -1 -1 -1 0
            0 -1 -1 -1 0
            0 -1 -1 -1 0
            0 0 0 0 0
            """;
        String expectedOutput = "14";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = """
            2 2
            1 -1
            -1 1
            """;
        String expectedOutput = "0";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
