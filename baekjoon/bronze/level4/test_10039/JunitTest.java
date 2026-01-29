package baekjoon.bronze.level4.test_10039;

import org.junit.Test;
import util.TestSupport;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws Exception {
        String input = """
            10
            65
            100
            30
            95
            """;
        String expectedOutput = "68";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
