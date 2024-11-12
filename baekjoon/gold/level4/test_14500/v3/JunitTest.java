package gold.level4.test_14500.v3;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            5 5
            1 2 3 4 5
            5 4 3 2 1
            2 3 4 5 6
            6 5 4 3 2
            1 2 1 2 1
            """;
        String expectedOutput = "19";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            """;
        String expectedOutput = "20";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            4 10
            1 2 1 2 1 2 1 2 1 2
            2 1 2 1 2 1 2 1 2 1
            1 2 1 2 1 2 1 2 1 2
            2 1 2 1 2 1 2 1 2 1
            """;
        String expectedOutput = "7";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
