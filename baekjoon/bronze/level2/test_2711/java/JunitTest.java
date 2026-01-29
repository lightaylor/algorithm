package baekjoon.bronze.level2.test_2711.java;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            4
            4 MISSPELL
            1 PROGRAMMING
            7 CONTEST
            3 BALLOON
            """;
        String expectedOutput = """
            MISPELL
            ROGRAMMING
            CONTES
            BALOON
            """;

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
