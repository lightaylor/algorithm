package gold.level3.test_2146.v1;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            10
            1 1 1 0 0 0 0 1 1 1
            1 1 1 1 0 0 0 0 1 1
            1 0 1 1 0 0 0 0 1 1
            0 0 1 1 1 0 0 0 0 1
            0 0 0 1 0 0 0 0 0 1
            0 0 0 0 0 0 0 0 0 1
            0 0 0 0 0 0 0 0 0 0
            0 0 0 0 1 1 0 0 0 0
            0 0 0 0 1 1 1 0 0 0
            0 0 0 0 0 0 0 0 0 0
            """;
        String expectedOutput = "3";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
