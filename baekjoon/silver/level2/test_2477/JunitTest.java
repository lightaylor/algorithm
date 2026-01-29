package baekjoon.silver.level2.test_2477;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                7
                4 50
                2 160
                3 30
                1 60
                3 20
                1 100
                """;
        String expectedOutput = "47600";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

   @Test
    public void test_2() throws IOException {
        String input = """
                1
                2 5
                3 5
                1 1
                4 2
                1 4
                4 3
                """;
        String expectedOutput = "17";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
