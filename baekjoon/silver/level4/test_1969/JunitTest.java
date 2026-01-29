package baekjoon.silver.level4.test_1969;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            5 8
            TATGATAC
            TAAGCTAC
            AAAGATCC
            TGAGATAC
            TAAGATGT
            """;
        String expectedOutput = """
            TAAGATAC
            7
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            4 10
            ACGTACGTAC
            CCGTACGTAG
            GCGTACGTAT
            TCGTACGTAA
            """;
        String expectedOutput = """
            ACGTACGTAA
            6
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            6 10
            ATGTTACCAT
            AAGTTACGAT
            AACAAAGCAA
            AAGTTACCTT
            AAGTTACCAA
            TACTTACCAA
            """;
        String expectedOutput = """
            AAGTTACCAA
            12
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
