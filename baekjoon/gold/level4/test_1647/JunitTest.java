package baekjoon.gold.level4.test_1647;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            7 12
            1 2 3
            1 3 2
            3 2 1
            2 5 2
            3 4 4
            7 3 6
            5 1 5
            1 6 2
            6 4 1
            6 5 3
            4 5 3
            6 7 4
            """;
        String expectedOutput = "8";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
