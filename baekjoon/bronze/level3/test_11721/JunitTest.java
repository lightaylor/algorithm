package baekjoon.bronze.level3.test_11721;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "BaekjoonOnlineJudge";
        String expectedOutput = """
            BaekjoonOn
            lineJudge
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = "OneTwoThreeFourFiveSixSevenEightNineTen";
        String expectedOutput = """
            OneTwoThre
            eFourFiveS
            ixSevenEig
            htNineTen
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
