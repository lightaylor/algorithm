package baekjoon.silver.level1.test_1931;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            11
            1 4
            3 5
            0 6
            5 7
            3 8
            5 9
            6 10
            8 11
            8 12
            2 13
            12 14
            """;
        String expectedOutput = "4";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
