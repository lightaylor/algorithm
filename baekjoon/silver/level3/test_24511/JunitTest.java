package silver.level3.test_24511;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                4
                0 1 1 0
                1 2 3 4
                3
                2 4 7
                """;
        String expectedOutput = "4 1 2 ";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                5
                1 1 1 1 1
                1 2 3 4 5
                3
                1 3 5
                """;
        String expectedOutput = "1 3 5 ";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
