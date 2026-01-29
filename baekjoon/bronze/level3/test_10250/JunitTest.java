package baekjoon.bronze.level3.test_10250;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5
                6 12 10
                30 50 72
                1 1 1
                10 10 100
                5 9 45
                """;
        String expectedOutput = """
                402
                1203
                101
                1010
                509
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
