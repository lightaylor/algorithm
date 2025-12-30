package gold.level4.test_1707.v3;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            2
            3 2
            1 3
            2 3
            4 4
            1 2
            2 3
            3 4
            4 2
            """;
        String expectedOutput = """
            YES
            NO
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
