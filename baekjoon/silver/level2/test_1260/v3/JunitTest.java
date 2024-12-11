package silver.level2.test_1260.v3;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            4 5 1
            1 2
            1 3
            1 4
            2 4
            3 4
            """;
        String expectedOutput = """
            1 2 4 3
            1 2 3 4
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            5 5 3
            5 4
            5 2
            1 2
            3 4
            3 1
            """;
        String expectedOutput = """
            3 1 2 5 4
            3 1 4 2 5
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            1000 1 1000
            999 1000
            """;
        String expectedOutput = """
            1000 999
            1000 999
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
