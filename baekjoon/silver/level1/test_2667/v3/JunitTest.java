package baekjoon.silver.level1.test_2667.v3;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            7
            0110100
            0110101
            1110101
            0000111
            0100000
            0111110
            0111000
            """;
        String expectedOutput = """
            3
            7
            8
            9
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
