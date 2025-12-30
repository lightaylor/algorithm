package silver.level3.test_2075;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            5
            12 7 9 15 5
            13 8 11 19 6
            21 10 26 31 16
            48 14 28 35 25
            52 20 32 41 49
            """;
        String expectedOutput = "35";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
