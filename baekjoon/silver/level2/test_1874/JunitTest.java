package baekjoon.silver.level2.test_1874;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                8
                4
                3
                6
                8
                7
                5
                2
                1
                """;
        String expectedOutput = """
                +
                +
                +
                +
                -
                -
                +
                +
                -
                +
                +
                -
                -
                -
                -
                -
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                5
                1
                2
                5
                3
                4
                """;
        String expectedOutput = "NO";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
