package baekjoon.bronze.level1.test_1296;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            LOVE
            3
            JACOB
            FRANK
            DANO
            """;
        String expectedOutput = "FRANK";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            JANE
            4
            THOMAS
            MICHAEL
            INDY
            LIU
            """;
        String expectedOutput = "INDY";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            LILLY
            1
            PIERRE
            """;
        String expectedOutput = "PIERRE";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            MERYLOV
            5
            JOHN
            DAVE
            STEVE
            JOHN
            DAVE
            """;
        String expectedOutput = "DAVE";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = """
            LLOL
            4
            BVERON
            CVERON
            AVERON
            DVERON
            """;
        String expectedOutput = "AVERON";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_6() throws IOException {
        String input = """
            VELYLEOCEVE
            5
            YVXHOVE
            LCOKO
            OGWSJVEVEDLE
            WGFVSJEL
            VLOLUVCBLLQVESWHEEKC
            """;
        String expectedOutput = "VLOLUVCBLLQVESWHEEKC";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
