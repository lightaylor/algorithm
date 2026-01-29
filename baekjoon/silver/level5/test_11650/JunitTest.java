package baekjoon.silver.level5.test_11650;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5
                3 4
                1 1
                1 -1
                2 2
                3 3""";
        String expectedOutput = """
                1 -1
                1 1
                2 2
                3 3
                3 4
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
