package baekjoon.gold.level4.test_10942;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            7
            1 2 1 3 1 2 1
            4
            1 3
            2 5
            3 3
            5 7
            """;
        String expectedOutput = """
            1
            0
            1
            1
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
