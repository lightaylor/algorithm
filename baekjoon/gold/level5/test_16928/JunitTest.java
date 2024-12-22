package gold.level5.test_16928;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            3 7
            32 62
            42 68
            12 98
            95 13
            97 25
            93 37
            79 27
            75 19
            49 47
            67 17
            """;
        String expectedOutput = "3";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            4 9
            8 52
            6 80
            26 42
            2 72
            51 19
            39 11
            37 29
            81 3
            59 5
            79 23
            53 7
            43 33
            77 21
            """;
        String expectedOutput = "5";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
