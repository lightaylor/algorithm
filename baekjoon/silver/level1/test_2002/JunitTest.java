package silver.level1.test_2002;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            4
            ZG431SN
            ZG5080K
            ST123D
            ZG206A
            ZG206A
            ZG431SN
            ZG5080K
            ST123D
            """;
        String expectedOutput = "1";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            5
            ZG508OK
            PU305A
            RI604B
            ZG206A
            ZG232ZF
            PU305A
            ZG232ZF
            ZG206A
            ZG508OK
            RI604B
            """;
        String expectedOutput = "3";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            5
            ZG206A
            PU234Q
            OS945CK
            ZG431SN
            ZG5962J
            ZG5962J
            OS945CK
            ZG206A
            PU234Q
            ZG431SN
            """;
        String expectedOutput = "2";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
