package baekjoon.bronze.level4.test_2455;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    
    @Test
    public void test_1() throws IOException {
        String input = """
            0 32
            3 13
            28 25
            39 0
            """;
        String expectedOutput = "42";

        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
