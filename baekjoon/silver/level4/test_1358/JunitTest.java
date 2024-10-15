package silver.level4.test_1358;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                20 10 5 0 3
                15 5
                1 5
                1 1
                """;
        String expectedOutput = "2";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                20 10 0 0 14
                -5 5
                -4 2
                -4 8
                -3 1
                -3 9
                0 0
                0 10
                20 0
                20 10
                23 1
                23 9
                24 2
                24 8
                25 5
                """;
        String expectedOutput = "14";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                52 84 -44 66 10
                26 118
                -33 106
                -49 128
                40 114
                -10 101
                47 85
                25 142
                -16 140
                -82 126
                7 145
                """;
        String expectedOutput = "8";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                24 100 -62 71 8
                -63 109
                -26 164
                -9 91
                -113 80
                -124 75
                -95 140
                -89 116
                -55 113
                """;
        String expectedOutput = "6";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
