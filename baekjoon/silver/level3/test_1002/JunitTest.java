package baekjoon.silver.level3.test_1002;

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
            0 0 13 40 0 37
            0 0 3 0 7 4
            1 1 1 1 1 5
            """;
        String expectedOutput = """
            2
            1
            0
            """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
