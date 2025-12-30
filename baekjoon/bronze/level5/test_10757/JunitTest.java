package bronze.level5.test_10757;

import org.junit.Test;
import util.TestUtil;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    
    @Test
    public void test_1() throws Exception {
        String input = "9223372036854775807 9223372036854775808";
        String expectedOutput = "18446744073709551615";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
