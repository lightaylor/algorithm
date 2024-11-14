package silver.level2.test_6603.v1;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            7 1 2 3 4 5 6 7
            8 1 2 3 5 8 13 21 34
            0
            """;
        String expectedOutput = """
            1 2 3 4 5 6\s
            1 2 3 4 5 7\s
            1 2 3 4 6 7\s
            1 2 3 5 6 7\s
            1 2 4 5 6 7\s
            1 3 4 5 6 7\s
            2 3 4 5 6 7\s

            1 2 3 5 8 13\s
            1 2 3 5 8 21\s
            1 2 3 5 8 34\s
            1 2 3 5 13 21\s
            1 2 3 5 13 34\s
            1 2 3 5 21 34\s
            1 2 3 8 13 21\s
            1 2 3 8 13 34\s
            1 2 3 8 21 34\s
            1 2 3 13 21 34\s
            1 2 5 8 13 21\s
            1 2 5 8 13 34\s
            1 2 5 8 21 34\s
            1 2 5 13 21 34\s
            1 2 8 13 21 34\s
            1 3 5 8 13 21\s
            1 3 5 8 13 34\s
            1 3 5 8 21 34\s
            1 3 5 13 21 34\s
            1 3 8 13 21 34\s
            1 5 8 13 21 34\s
            2 3 5 8 13 21\s
            2 3 5 8 13 34\s
            2 3 5 8 21 34\s
            2 3 5 13 21 34\s
            2 3 8 13 21 34\s
            2 5 8 13 21 34\s
            3 5 8 13 21 34\s

            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
