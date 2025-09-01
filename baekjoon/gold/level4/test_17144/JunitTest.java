package gold.level4.test_17144;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            7 8 1
            0 0 0 0 0 0 0 9
            0 0 0 0 3 0 0 8
            -1 0 5 0 0 0 22 0
            -1 8 0 0 0 0 0 0
            0 0 0 0 0 10 43 0
            0 0 5 0 15 0 0 0
            0 0 40 0 0 0 20 0
            """;
        String expectedOutput = "188";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
