package baekjoon.gold.level5.test_5430;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                4
                RDD
                4
                [1,2,3,4]
                DD
                1
                [42]
                RRD
                6
                [1,1,2,3,5,8]
                D
                0
                []
                """;
        String expectedOutput = """
                [2,1]
                error
                [1,2,3,5,8]
                error
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
