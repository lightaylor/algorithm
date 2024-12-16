package gold.level5.test_15681;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            9 5 3
            1 3
            4 3
            5 4
            5 6
            6 7
            2 3
            9 6
            6 8
            5
            4
            8
            """;
        String expectedOutput = """
            9
            4
            1
            """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
