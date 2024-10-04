package silver.level4.test_28279;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                11
                6
                1 3
                1 8
                7
                8
                3
                2 5
                1 2
                5
                4
                4
                """;
        String expectedOutput = """
                1
                8
                3
                8
                3
                5
                3
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
