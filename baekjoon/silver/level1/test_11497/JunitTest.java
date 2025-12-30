package silver.level1.test_11497;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            3
            7
            13 10 12 11 10 11 12
            5
            2 4 5 7 9
            8
            6 6 6 6 6 6 6 6
            """;
        String expectedOutput = """
            1
            4
            0
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
