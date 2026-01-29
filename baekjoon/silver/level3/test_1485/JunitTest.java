package baekjoon.silver.level3.test_1485;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            2
            1 1
            1 2
            2 1
            2 2
            2 2
            3 3
            4 4
            5 5
            """;
        String expectedOutput = """
            1
            0
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
