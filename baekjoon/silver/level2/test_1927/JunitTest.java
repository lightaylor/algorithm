package silver.level2.test_1927;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            9
            0
            12345678
            1
            2
            0
            0
            0
            0
            32
            """;
        String expectedOutput = """
            0
            1
            2
            12345678
            0
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            17
            1
            10
            2
            30
            40
            300
            400
            25
            0
            0
            0
            0
            0
            0
            0
            0
            0
            0
            """;
        String expectedOutput = """
            1
            2
            10
            25
            30
            40
            300
            400
            0
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
