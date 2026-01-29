package baekjoon.silver.level1.test_7562.v1;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            3
            8
            0 0
            7 0
            100
            0 0
            30 50
            10
            1 1
            1 1
            """;
        String expectedOutput = """
            5
            28
            0
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
