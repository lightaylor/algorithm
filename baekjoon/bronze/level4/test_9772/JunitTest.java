package bronze.level4.test_9772;

import util.TestUtil;
import org.junit.Test;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws Exception {
        String input = """
            1 2
            -1 -0.12
            4 0
            -10.4 200
            0 0
            """;
        String expectedOutput = """
            Q1
            Q3
            AXIS
            Q2
            AXIS
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
