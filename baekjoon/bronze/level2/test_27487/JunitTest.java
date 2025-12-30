package bronze.level2.test_27487;

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
                6
                2 2 1 2 1 2
                3
                1 2 1
                4
                1 1 1 1
                8
                1 1 1 1 1 1 2 2
                """;
        String expectedOutput = """
                2
                -1
                1
                7
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
