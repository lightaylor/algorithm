package baekjoon.gold.level2.test_20303;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            10 6 6
            9 15 4 4 1 5 19 14 20 5
            1 3
            2 5
            4 9
            6 2
            7 8
            6 10
            """;
        String expectedOutput = "57";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            5 4 4
            9 9 9 9 9
            1 2
            2 3
            3 4
            4 5
            """;
        String expectedOutput = "0";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
