package gold.level5.test_17070;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            3
            0 0 0
            0 0 0
            0 0 0
            """;
        String expectedOutput = "1";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            4
            0 0 0 0
            0 0 0 0
            0 0 0 0
            0 0 0 0
            """;
        String expectedOutput = "3";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            5
            0 0 1 0 0
            0 0 0 0 0
            0 0 0 0 0
            0 0 0 0 0
            0 0 0 0 0
            """;
        String expectedOutput = "0";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            6
            0 0 0 0 0 0
            0 1 0 0 0 0
            0 0 0 0 0 0
            0 0 0 0 0 0
            0 0 0 0 0 0
            0 0 0 0 0 0
            """;
        String expectedOutput = "13";

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
