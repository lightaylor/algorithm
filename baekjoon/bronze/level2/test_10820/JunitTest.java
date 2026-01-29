package baekjoon.bronze.level2.test_10820;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            This is String
            SPACE    1    SPACE
             S a M p L e I n P u T    \s
            0L1A2S3T4L5I6N7E8
            """;
        String expectedOutput = """
            10 2 0 2
            0 10 1 8
            5 6 0 16
            0 8 9 0
            """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
