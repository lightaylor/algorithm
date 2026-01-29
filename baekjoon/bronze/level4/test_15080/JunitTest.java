package baekjoon.bronze.level4.test_15080;

import org.junit.Test;
import util.TestSupport;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws Exception {
        String input = """
                10 : 0 : 0
                11 : 0 : 0
                """;
        String expectedOutput = "3600";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws Exception {
        String input = """
                13 : 30 : 52
                13 : 31 : 7
                """;
        String expectedOutput = "15";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws Exception {
        String input = """
                23 : 0 : 0
                1 : 30 : 0
                """;
        String expectedOutput = "9000";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
