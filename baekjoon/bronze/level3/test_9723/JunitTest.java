package bronze.level3.test_9723;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            10
            20 16 12
            5 3 4
            15 12 9
            12 5 13
            12 13 5
            28 82 46
            43 96 92
            3 4 5
            13 5 12
            6 10 8
            """;
        String expectedOutput = """
            Case #1: YES
            Case #2: YES
            Case #3: YES
            Case #4: YES
            Case #5: YES
            Case #6: NO
            Case #7: NO
            Case #8: YES
            Case #9: YES
            Case #10: YES
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
