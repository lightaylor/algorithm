package baekjoon.silver.level1.test_2527;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            3 10 50 60 100 100 200 300
            45 50 600 600 400 450 500 543
            11 120 120 230 50 40 60 440
            35 56 67 90 67 80 500 600
            """;
        String expectedOutput = """
            d
            a
            a
            b
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
