package baekjoon.silver.level2.test_2630;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            8
            1 1 0 0 0 0 1 1
            1 1 0 0 0 0 1 1
            0 0 0 0 1 1 0 0
            0 0 0 0 1 1 0 0
            1 0 0 0 1 1 1 1
            0 1 0 0 1 1 1 1
            0 0 1 1 1 1 1 1
            0 0 1 1 1 1 1 1
            """;
        String expectedOutput = """
            9
            7
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
