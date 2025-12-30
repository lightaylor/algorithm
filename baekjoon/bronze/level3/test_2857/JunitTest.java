package bronze.level3.test_2857;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            N-FBI1
            9A-USKOK
            I-NTERPOL
            G-MI6
            RF-KGB1
            """;
        String expectedOutput = "1";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            N321-CIA
            F3-B12I
            F-BI-12
            OVO-JE-CIA
            KRIJUMCAR1
            """;
        String expectedOutput = "HE GOT AWAY!";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            47-FBI
            BOND-007
            RF-FBI18
            MARICA-13
            13A-FBILL
            """;
        String expectedOutput = "1 3 5";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
