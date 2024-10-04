package silver.level4.test_10816;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                10
                6 3 2 10 10 10 -10 -10 7 3
                8
                10 9 -5 2 3 4 5 -10
                """;
        String expectedOutput = "3 0 0 1 2 0 0 2 ";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
