package bronze.level3.test_6322;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            3 4 -1
            -1 2 7
            5 -1 3
            0 0 0
            """;
        String expectedOutput = """
            Triangle #1
            c = 5.000
            
            Triangle #2
            a = 6.708

            Triangle #3
            Impossible.
            
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
