package silver.level2.test_1012;

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
            10 8 17
            0 0
            1 0
            1 1
            4 2
            4 3
            4 5
            2 4
            3 4
            7 4
            8 4
            9 4
            7 5
            8 5
            9 5
            7 6
            8 6
            9 6
            10 10 1
            5 5
            """;
        String expectedOutput = """
            5
            1
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            1
            5 3 6
            0 2
            1 2
            2 2
            3 2
            4 2
            4 0
            """;
        String expectedOutput = """
            2
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
