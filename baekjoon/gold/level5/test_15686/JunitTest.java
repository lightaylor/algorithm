package gold.level5.test_15686;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                5 3
                0 0 1 0 0
                0 0 2 0 1
                0 1 2 0 0
                0 0 1 0 0
                0 0 0 0 2
                """;
        String expectedOutput = "5";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
                5 2
                0 2 0 1 0
                1 0 1 0 0
                0 0 0 0 0
                2 0 0 1 1
                2 2 0 1 2
                """;
        String expectedOutput = "10";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
                5 1
                1 2 0 0 0
                1 2 0 0 0
                1 2 0 0 0
                1 2 0 0 0
                1 2 0 0 0
                """;
        String expectedOutput = "11";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
                5 1
                1 2 0 2 1
                1 2 0 2 1
                1 2 0 2 1
                1 2 0 2 1
                1 2 0 2 1
                """;
        String expectedOutput = "32";
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
