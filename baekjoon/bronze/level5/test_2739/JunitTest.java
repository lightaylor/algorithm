package baekjoon.bronze.level5.test_2739;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "2";
        String expectedOutput =
                "2 * 1 = 2\n" +
                "2 * 2 = 4\n" +
                "2 * 3 = 6\n" +
                "2 * 4 = 8\n" +
                "2 * 5 = 10\n" +
                "2 * 6 = 12\n" +
                "2 * 7 = 14\n" +
                "2 * 8 = 16\n" +
                "2 * 9 = 18\n";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
