package baekjoon.gold.level2.test_3109;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            5 5
            .xx..
            ..x..
            .....
            ...x.
            ...x.
            """;
        String expectedOutput = "2";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            6 10
            ..x.......
            .....x....
            .x....x...
            ...x...xx.
            ..........
            ....x.....
            """;
        String expectedOutput = "5";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
