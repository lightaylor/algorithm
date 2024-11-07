package gold.level4.test_13913_2;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = "5 17";
        String expectedOutput = """
            4
            5 4 8 16 17
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
