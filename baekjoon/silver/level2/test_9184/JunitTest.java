package silver.level2.test_9184;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                1 1 1
                2 2 2
                10 4 6
                50 50 50
                -1 7 18
                -1 -1 -1""";
        String expectedOutput = """
                w(1, 1, 1) = 2
                w(2, 2, 2) = 4
                w(10, 4, 6) = 523
                w(50, 50, 50) = 1048576
                w(-1, 7, 18) = 1
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                1 1 1
                2 2 2
                10 4 6
                50 50 50
                20 20 19
                21 0 0
                -1 7 18
                1 1 21
                8 20 6
                -1 -1 -1""";
        String expectedOutput = """
                w(1, 1, 1) = 2
                w(2, 2, 2) = 4
                w(10, 4, 6) = 523
                w(50, 50, 50) = 1048576
                w(20, 20, 19) = 1048576
                w(21, 0, 0) = 1
                w(-1, 7, 18) = 1
                w(1, 1, 21) = 1048576
                w(8, 20, 6) = 256
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
