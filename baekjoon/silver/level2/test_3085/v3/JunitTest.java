package silver.level2.test_3085.v3;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            3
            CCP
            CCP
            PPC
            """;
        String expectedOutput = "3";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> silver.level2.test_3085.v2.Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            4
            PPPP
            CYZY
            CCPY
            PPCC
            """;
        String expectedOutput = "4";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> silver.level2.test_3085.v2.Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            5
            YCPZY
            CYZZP
            CCPPP
            YCYZC
            CPPZZ
            """;
        String expectedOutput = "4";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
