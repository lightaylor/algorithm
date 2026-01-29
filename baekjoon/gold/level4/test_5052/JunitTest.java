package baekjoon.gold.level4.test_5052;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            2
            3
            911
            97625999
            91125426
            5
            113
            12340
            123440
            12345
            98346
            """;
        String expectedOutput = """
            NO
            YES
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
