package silver.level3.test_9536;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            1
            toot woof wa ow ow ow pa blub blub pa toot pa blub pa pa ow pow toot
            dog goes woof
            fish goes blub
            elephant goes toot
            seal goes ow
            what does the fox say?
            """;
        String expectedOutput = """
            wa pa pa pa pa pa pow
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
