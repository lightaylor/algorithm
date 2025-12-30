package bronze.level3.test_5086;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "8 16\n" +
                "32 4\n" +
                "17 5\n" +
                "0 0";
        String expectedOutput = "factor\n" +
                "multiple\n" +
                "neither\n";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
