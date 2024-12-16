package silver.level3.test_1004;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            2
            -5 1 12 1
            7
            1 1 8
            -3 -1 1
            2 2 2
            5 5 1
            -4 5 1
            12 1 1
            12 1 2
            -5 1 5 1
            1
            0 0 2
            """;
        String expectedOutput = """
            3
            0
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            3
            -5 1 5 1
            3
            0 0 2
            -6 1 2
            6 2 2
            2 3 13 2
            8
            -3 -1 1
            2 2 3
            2 3 1
            0 1 7
            -4 5 1
            12 1 1
            12 1 2
            12 1 3
            102 16 19 -108
            12
            -107 175 135
            -38 -115 42
            140 23 70
            148 -2 39
            -198 -49 89
            172 -151 39
            -179 -52 43
            148 42 150
            176 0 10
            153 68 120
            -56 109 16
            -187 -174 8
            """;
        String expectedOutput = """
            2
            5
            3
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
