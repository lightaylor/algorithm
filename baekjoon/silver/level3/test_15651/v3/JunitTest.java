package silver.level3.test_15651.v3;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "3 1";
        String expectedOutput = """
            1
            2
            3
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = "4 2";
        String expectedOutput = """
            1 1
            1 2
            1 3
            1 4
            2 1
            2 2
            2 3
            2 4
            3 1
            3 2
            3 3
            3 4
            4 1
            4 2
            4 3
            4 4
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = "3 3";
        String expectedOutput = """
            1 1 1
            1 1 2
            1 1 3
            1 2 1
            1 2 2
            1 2 3
            1 3 1
            1 3 2
            1 3 3
            2 1 1
            2 1 2
            2 1 3
            2 2 1
            2 2 2
            2 2 3
            2 3 1
            2 3 2
            2 3 3
            3 1 1
            3 1 2
            3 1 3
            3 2 1
            3 2 2
            3 2 3
            3 3 1
            3 3 2
            3 3 3
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
