package silver.level1.test_1946;

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
                5
                3 2
                1 4
                4 1
                2 3
                5 5
                7
                3 6
                7 3
                4 2
                1 4
                5 7
                2 5
                6 1
                """;
        String expectedOutput = "4 3";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
