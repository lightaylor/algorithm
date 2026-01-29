package baekjoon.gold.level3.test_11779;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            5
            8
            1 2 2
            1 3 3
            1 4 1
            1 5 10
            2 4 2
            3 4 1
            3 5 1
            4 5 3
            1 5
            """;
        String expectedOutput = """
            4
            3
            1 4 5
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
