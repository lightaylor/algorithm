package silver.level5.test_2740;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            3 2
            1 2
            3 4
            5 6
            2 3
            -1 -2 0
            0 0 3
            """;
        String expectedOutput = """
            -1 -2 6
            -3 -6 12
            -5 -10 18
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
