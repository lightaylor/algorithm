package silver.level2.test_4963.v2;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

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
