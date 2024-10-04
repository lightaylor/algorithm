package silver.level1.test_9465;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                2
                5
                50 10 100 20 40
                30 50 70 10 60
                7
                10 30 10 50 100 20 40
                20 40 30 50 60 20 80
                """;
        String expectedOutput = """
                260
                290
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
