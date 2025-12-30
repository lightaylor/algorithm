package silver.level1.test_14940;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            15 15
            2 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 0 0 0 0 1
            1 1 1 1 1 1 1 1 1 1 0 1 1 1 1
            1 1 1 1 1 1 1 1 1 1 0 1 0 0 0
            1 1 1 1 1 1 1 1 1 1 0 1 1 1 1
            """;
        String expectedOutput = """
            0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
            1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
            2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
            3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
            4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
            5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
            6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
            7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
            8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
            9 10 11 12 13 14 15 16 17 18 19 20 21 22 23
            10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
            11 12 13 14 15 16 17 18 19 20 0 0 0 0 25
            12 13 14 15 16 17 18 19 20 21 0 29 28 27 26
            13 14 15 16 17 18 19 20 21 22 0 30 0 0 0
            14 15 16 17 18 19 20 21 22 23 0 31 32 33 34
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            2 2
            1 1
            1 2
            """;
        String expectedOutput = """
            2 1
            1 0
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
