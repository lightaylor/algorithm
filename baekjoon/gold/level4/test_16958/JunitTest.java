package baekjoon.gold.level4.test_16958;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            6 3
            0 1 2
            0 5 1
            1 3 3
            1 1 5
            0 3 5
            1 7 5
            5
            1 2
            1 5
            1 6
            3 4
            4 2
            """;
        String expectedOutput = """
            5
            5
            6
            3
            7
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            6 2
            1 1 1
            1 1 2
            1 1 3
            1 2 1
            1 2 2
            1 2 3
            6
            1 2
            2 3
            3 4
            4 5
            5 6
            6 1
            """;
        String expectedOutput = """
            1
            1
            2
            1
            1
            2
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
