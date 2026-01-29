package baekjoon.bronze.level5.test_11021;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "5\n1 1\n2 3\n3 4\n9 8\n5 2";
        String expectedOutput =
                "Case #1: 2\n" +
                "Case #2: 5\n" +
                "Case #3: 7\n" +
                "Case #4: 17\n" +
                "Case #5: 7\n";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
