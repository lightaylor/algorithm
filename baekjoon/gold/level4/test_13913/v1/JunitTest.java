package baekjoon.gold.level4.test_13913.v1;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = "5 17";
        String expectedOutput = """
            4
            5 4 8 16 17\s
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
