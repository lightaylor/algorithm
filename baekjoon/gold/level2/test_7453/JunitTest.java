package gold.level2.test_7453;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            6
            -45 22 42 -16
            -41 -27 56 30
            -36 53 -37 77
            -36 30 -75 -46
            26 -38 -10 62
            -32 -54 -6 45
            """;
        String expectedOutput = "5";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
