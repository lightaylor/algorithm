package baekjoon.silver.level4.test_11047;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                10 4200
                1
                5
                10
                50
                100
                500
                1000
                5000
                10000
                50000
                """;
        String expectedOutput = "6";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                10 4790
                1
                5
                10
                50
                100
                500
                1000
                5000
                10000
                50000
                """;
        String expectedOutput = "12";
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
