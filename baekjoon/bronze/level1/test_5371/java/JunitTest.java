package baekjoon.bronze.level1.test_5371.java;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            2
            3
            15 -10
            16 40
            17 41
            1
            15 -10
            1
            100 100
            3
            90 90
            100 110
            -500 -400
            """;
        String expectedOutput = """
            2
            1
            """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
