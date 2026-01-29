package baekjoon.bronze.level1.test_10989.java;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    
    @Test
    public void test_1() throws IOException {
        String input = """
            10
            5
            2
            3
            1
            4
            2
            3
            5
            1
            7
            """;
        String expectedOutput = """
            1
            1
            2
            2
            3
            3
            4
            5
            5
            7
            """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
