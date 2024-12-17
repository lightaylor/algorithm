package silver.level2.test_4963.v3;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            1 1
            0
            2 2
            0 1
            1 0
            3 2
            1 1 1
            1 1 1
            5 4
            1 0 1 0 0
            1 0 0 0 0
            1 0 1 0 1
            1 0 0 1 0
            5 4
            1 1 1 0 1
            1 0 1 0 1
            1 0 1 0 1
            1 0 1 1 1
            5 5
            1 0 1 0 1
            0 0 0 0 0
            1 0 1 0 1
            0 0 0 0 0
            1 0 1 0 1
            0 0
            """;
        String expectedOutput = """
            0
            1
            1
            3
            1
            9
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
