package bronze.level4.test_10101;

import util.TestUtil;
import org.junit.Test;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws Exception {
        String input = "60\n" +
                "70\n" +
                "50";
        String expectedOutput = "Scalene";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
