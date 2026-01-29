package baekjoon.bronze.level4.test_10101;

import org.junit.Test;
import util.TestSupport;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws Exception {
        String input = "60\n" +
                "70\n" +
                "50";
        String expectedOutput = "Scalene";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
