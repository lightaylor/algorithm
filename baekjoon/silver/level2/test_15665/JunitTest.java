package silver.level2.test_15665;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                3 1
                4 4 2
                """;
        String expectedOutput = """
                2
                4
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                4 2
                9 7 9 1
                """;
        String expectedOutput = """
                1 1
                1 7
                1 9
                7 1
                7 7
                7 9
                9 1
                9 7
                9 9
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                4 4
                1 1 2 2
                """;
        String expectedOutput = """
                1 1 1 1
                1 1 1 2
                1 1 2 1
                1 1 2 2
                1 2 1 1
                1 2 1 2
                1 2 2 1
                1 2 2 2
                2 1 1 1
                2 1 1 2
                2 1 2 1
                2 1 2 2
                2 2 1 1
                2 2 1 2
                2 2 2 1
                2 2 2 2
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
