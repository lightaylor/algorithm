package baekjoon.silver.level5.test_10815;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5
                6 3 2 10 -10
                8
                10 9 -5 2 3 4 5 -10
                """;
        String expectedOutput = "1 0 0 1 1 0 0 1 ";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
