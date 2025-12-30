package gold.level4.test_1753;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            5 6
            1
            5 1 1
            1 2 2
            1 3 3
            2 3 4
            2 4 5
            3 4 6
            """;
        String expectedOutput = """
            0
            2
            3
            7
            INF
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
