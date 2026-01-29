package baekjoon.gold.level3.test_2638;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            8 9
            0 0 0 0 0 0 0 0 0
            0 0 0 1 1 0 0 0 0
            0 0 0 1 1 0 1 1 0
            0 0 1 1 1 1 1 1 0
            0 0 1 1 1 1 1 0 0
            0 0 1 1 0 1 1 0 0
            0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0
            """;
        String expectedOutput = "4";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
