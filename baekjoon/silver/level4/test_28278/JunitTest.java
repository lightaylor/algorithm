package baekjoon.silver.level4.test_28278;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                9
                4
                1 3
                1 5
                3
                2
                5
                2
                2
                5
                """;
        String expectedOutput = """
                1
                2
                5
                3
                3
                -1
                -1
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
