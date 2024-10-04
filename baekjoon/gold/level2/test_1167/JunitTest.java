package gold.level2.test_1167;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5
                1 3 2 -1
                2 4 4 -1
                3 1 2 4 3 -1
                4 2 4 3 3 5 6 -1
                5 4 6 -1
                """;
        String expectedOutput = "11";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
