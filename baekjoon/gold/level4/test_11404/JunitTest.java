package gold.level4.test_11404;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            5
            14
            1 2 2
            1 3 3
            1 4 1
            1 5 10
            2 4 2
            3 4 1
            3 5 1
            4 5 3
            3 5 10
            3 1 8
            1 4 2
            5 1 7
            3 4 2
            5 2 4
            """;
        String expectedOutput = """
            0 2 3 1 4
            12 0 15 2 5
            8 5 0 1 1
            10 7 13 0 3
            7 4 10 6 0
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
