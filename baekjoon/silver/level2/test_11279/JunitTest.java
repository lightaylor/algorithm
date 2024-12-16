package silver.level2.test_11279;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            13
            0
            1
            2
            0
            0
            3
            2
            1
            0
            0
            0
            0
            0
            """;
        String expectedOutput = """
            0
            2
            1
            3
            2
            1
            0
            0
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
