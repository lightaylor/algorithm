package baekjoon.bronze.level1.test_9506.java;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            6
            12
            28
            -1
            """;
        String expectedOutput = """
            6 = 1 + 2 + 3
            12 is NOT perfect.
            28 = 1 + 2 + 4 + 7 + 14
            """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
