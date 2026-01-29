package baekjoon.gold.level3.test_1865;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            2
            3 3 1
            1 2 2
            1 3 4
            2 3 1
            3 1 3
            3 2 1
            1 2 3
            2 3 4
            3 1 8
            """;
        String expectedOutput = """
            NO
            YES
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
