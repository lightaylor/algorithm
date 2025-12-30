package silver.level2.test_4948;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                1
                10
                13
                100
                1000
                10000
                100000
                0
                """;
        String expectedOutput = """
                1
                4
                3
                21
                135
                1033
                8392
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
