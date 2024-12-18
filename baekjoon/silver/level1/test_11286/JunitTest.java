package silver.level1.test_11286;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            18
            1
            -1
            0
            0
            0
            1
            1
            -1
            -1
            2
            -2
            0
            0
            0
            0
            0
            0
            0
            """;
        String expectedOutput = """
            -1
            1
            0
            -1
            -1
            1
            1
            -2
            2
            0
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
