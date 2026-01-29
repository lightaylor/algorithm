package baekjoon.silver.level2.test_3085.v3;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

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

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
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

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
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

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
