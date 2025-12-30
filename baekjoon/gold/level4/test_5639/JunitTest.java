package gold.level4.test_5639;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    
    @Test
    public void test_1() throws IOException {
        String input = """
            50
            30
            24
            5
            28
            45
            98
            52
            60
            """;
        String expectedOutput = """
            5
            28
            24
            45
            30
            60
            52
            98
            50
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
