package gold.level5.test_15661.v1;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            4
            0 1 2 3
            4 0 5 6
            7 1 0 2
            3 4 5 0
            """;
        String expectedOutput = "0";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            6
            0 1 2 3 4 5
            1 0 2 3 4 5
            1 2 0 3 4 5
            1 2 3 0 4 5
            1 2 3 4 0 5
            1 2 3 4 5 0
            """;
        String expectedOutput = "2";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            8
            0 5 4 5 4 5 4 5
            4 0 5 1 2 3 4 5
            9 8 0 1 2 3 1 2
            9 9 9 0 9 9 9 9
            1 1 1 1 0 1 1 1
            8 7 6 5 4 0 3 2
            9 1 9 1 9 1 0 9
            6 5 4 3 2 1 9 0
            """;
        String expectedOutput = "1";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            5
            0 3 1 1 1
            3 0 1 1 1
            1 1 0 1 1
            1 1 1 0 1
            1 1 1 1 0
            """;
        String expectedOutput = "0";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
