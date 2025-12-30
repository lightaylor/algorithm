package bronze.level2.test_2756;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            2
            -9 0 0 -4.5 -2 2 9 0 0 4.5 2 -2
            -19.0 19.0 0 0 0 0 3 3 6 6 12 12
            """;
        String expectedOutput = """
            SCORE: 240 to 240, TIE.
            SCORE: 200 to 140, PLAYER 1 WINS.
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
