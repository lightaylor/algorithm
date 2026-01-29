package baekjoon.silver.level2.test_18111;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            3 4 99
            0 0 0 0
            0 0 0 0
            0 0 0 1
            """;
        String expectedOutput = "2 0";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            3 4 1
            64 64 64 64
            64 64 64 64
            64 64 64 63
            """;
        String expectedOutput = "1 64";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
