package gold.level4.test_1987;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            2 4
            CAAB
            ADCB
            """;
        String expectedOutput = "3";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            3 6
            HFDFFB
            AJHGDH
            DGAGEH
            """;
        String expectedOutput = "6";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            5 5
            IEFCJ
            FHFKC
            FFALF
            HFGCF
            HMCHH
            """;
        String expectedOutput = "10";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
