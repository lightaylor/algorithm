package baekjoon.gold.level3.test_2623;

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
            3 1 4 3
            4 6 2 5 4
            2 2 3
            """;
        String expectedOutput = """
            1
            6
            2
            5
            4
            3
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
