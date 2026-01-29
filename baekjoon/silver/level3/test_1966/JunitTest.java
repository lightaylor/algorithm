package baekjoon.silver.level3.test_1966;

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
                1 0
                5
                4 2
                1 2 3 4
                6 0
                1 1 9 1 1 1
                """;
        String expectedOutput = """
                1
                2
                5
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
