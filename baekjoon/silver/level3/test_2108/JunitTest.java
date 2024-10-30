package silver.level3.test_2108;

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
            1
            3
            8
            -2
            2
            """;
        String expectedOutput = """
            2
            2
            1
            10
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            1
            4000
            """;
        String expectedOutput = """
            4000
            4000
            4000
            0
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            5
            -1
            -2
            -3
            -1
            -2
            """;
        String expectedOutput = """
            -2
            -2
            -1
            2
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            3
            0
            0
            -1
            """;
        String expectedOutput = """
            0
            0
            0
            1
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = """
            5
            -4000
            0
            1
            2
            3
            """;
        String expectedOutput = """
            -799
            1
            0
            4003
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_6() throws IOException {
        String input = """
            3
            -4000
            4000
            0
            """;
        String expectedOutput = """
            0
            0
            0
            8000
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_7() throws IOException {
        String input = """
            3
            0
            -1
            -1
            """;
        String expectedOutput = """
            -1
            -1
            -1
            1
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
