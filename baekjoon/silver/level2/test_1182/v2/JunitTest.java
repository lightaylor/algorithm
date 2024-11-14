package silver.level2.test_1182.v2;

import common.TestUtil;
import org.junit.Test;
import silver.level2.test_1182.v1.Main;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            5 0
            -7 -3 -2 5 8
            """;
        String expectedOutput = "1";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
