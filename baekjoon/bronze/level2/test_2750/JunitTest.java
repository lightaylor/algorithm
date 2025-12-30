package bronze.level2.test_2750;

import util.TestUtil;
import org.junit.Test;

import java.io.*;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5
                5
                2
                3
                4
                1
                """;
        String expectedOutput = """
                1
                2
                3
                4
                5
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
