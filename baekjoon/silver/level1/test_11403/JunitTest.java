package baekjoon.silver.level1.test_11403;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            3
            0 1 0
            0 0 1
            1 0 0
            """;
        String expectedOutput = """
            1 1 1
            1 1 1
            1 1 1
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            7
            0 0 0 1 0 0 0
            0 0 0 0 0 0 1
            0 0 0 0 0 0 0
            0 0 0 0 1 1 0
            1 0 0 0 0 0 0
            0 0 0 0 0 0 1
            0 0 1 0 0 0 0
            """;
        String expectedOutput = """
            1 0 1 1 1 1 1
            0 0 1 0 0 0 1
            0 0 0 0 0 0 0
            1 0 1 1 1 1 1
            1 0 1 1 1 1 1
            0 0 1 0 0 0 1
            0 0 1 0 0 0 0
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
