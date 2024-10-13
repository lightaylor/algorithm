package bronze.level4.test_16486;

import common.TestUtil;
import org.junit.Test;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws Exception {
        String input = """
            13
            8
            """;
        String expectedOutput = "76.265482";
        
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
