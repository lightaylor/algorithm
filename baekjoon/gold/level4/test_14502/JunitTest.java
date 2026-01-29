package baekjoon.gold.level4.test_14502;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            7 7
            2 0 0 0 1 1 0
            0 0 1 0 1 2 0
            0 1 1 0 1 0 0
            0 1 0 0 0 0 0
            0 0 0 0 0 1 1
            0 1 0 0 0 0 0
            0 1 0 0 0 0 0
            """;
        String expectedOutput = "27";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            4 6
            0 0 0 0 0 0
            1 0 0 0 0 2
            1 1 1 0 0 2
            0 0 0 0 0 2
            """;
        String expectedOutput = "9";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            8 8
            2 0 0 0 0 0 0 2
            2 0 0 0 0 0 0 2
            2 0 0 0 0 0 0 2
            2 0 0 0 0 0 0 2
            2 0 0 0 0 0 0 2
            0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0
            """;
        String expectedOutput = "3";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
