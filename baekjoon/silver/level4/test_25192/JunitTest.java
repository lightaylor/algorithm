package silver.level4.test_25192;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                9
                ENTER
                pjshwa
                chansol
                chogahui05
                lms0806
                pichulia
                r4pidstart
                swoon
                tony9402
                """;
        String expectedOutput = "8";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                7
                ENTER
                pjshwa
                chansol
                chogahui05
                ENTER
                pjshwa
                chansol
                """;
        String expectedOutput = "5";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
