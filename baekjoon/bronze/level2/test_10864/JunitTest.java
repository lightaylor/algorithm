package baekjoon.bronze.level2.test_10864;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5 5
                1 2
                3 4
                2 5
                5 1
                4 2
                """;
        String expectedOutput = """
                2
                3
                1
                2
                2
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
