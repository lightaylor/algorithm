package baekjoon.gold.level3.test_2146.v2;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            10
            1 1 1 0 0 0 0 1 1 1
            1 1 1 1 0 0 0 0 1 1
            1 0 1 1 0 0 0 0 1 1
            0 0 1 1 1 0 0 0 0 1
            0 0 0 1 0 0 0 0 0 1
            0 0 0 0 0 0 0 0 0 1
            0 0 0 0 0 0 0 0 0 0
            0 0 0 0 1 1 0 0 0 0
            0 0 0 0 1 1 1 0 0 0
            0 0 0 0 0 0 0 0 0 0
            """;
        String expectedOutput = "3";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
