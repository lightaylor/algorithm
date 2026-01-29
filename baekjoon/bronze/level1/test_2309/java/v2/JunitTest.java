package baekjoon.bronze.level1.test_2309.java.v2;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            20
            7
            23
            19
            10
            15
            25
            8
            13
            """;
        String expectedOutput = """
            7
            8
            10
            13
            19
            20
            23
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            40
            40
            10
            10
            10
            10
            10
            10
            10
            """;
        String expectedOutput = """
            10
            10
            10
            10
            10
            10
            40
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
