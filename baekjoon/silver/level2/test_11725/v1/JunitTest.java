package silver.level2.test_11725.v1;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            7
            1 6
            6 3
            3 5
            4 1
            2 4
            4 7
            """;
        String expectedOutput = """
            4
            6
            1
            3
            1
            4
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            12
            1 2
            1 3
            2 4
            3 5
            3 6
            4 7
            4 8
            5 9
            5 10
            6 11
            6 12
            """;
        String expectedOutput = """
            1
            1
            2
            3
            3
            4
            4
            5
            5
            6
            6
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            10
            1 3
            5 4
            3 2
            2 7
            5 7
            9 10
            5 10
            6 8
            1 6
            """;
        String expectedOutput = """
            3
            1
            5
            7
            1
            2
            6
            10
            5
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
