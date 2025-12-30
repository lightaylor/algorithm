package gold.level3.test_16236;

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
            0 9 0
            """;
        String expectedOutput = "0";

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            3
            0 0 1
            0 0 0
            0 9 0
            """;
        String expectedOutput = "3";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            4
            4 3 2 1
            0 0 0 0
            0 0 9 0
            1 2 3 4
            """;
        String expectedOutput = "14";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            6
            5 4 3 2 3 4
            4 3 2 3 4 5
            3 2 9 5 6 6
            2 1 2 3 4 5
            3 2 1 6 5 4
            6 6 6 6 6 6
            """;
        String expectedOutput = "60";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_5() throws IOException {
        String input = """
            6
            6 0 6 0 6 1
            0 0 0 0 0 2
            2 3 4 5 6 6
            0 0 0 0 0 2
            0 2 0 0 0 0
            3 9 3 0 0 1
            """;
        String expectedOutput = "48";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_6() throws IOException {
        String input = """
            6
            1 1 1 1 1 1
            2 2 6 2 2 3
            2 2 5 2 2 3
            2 2 2 4 6 3
            0 0 0 0 0 6
            0 0 0 0 0 9
            """;
        String expectedOutput = "39";
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
