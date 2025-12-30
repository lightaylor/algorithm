package bronze.level2.test_1009.java;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            5
            1 6
            3 7
            6 2
            7 100
            9 635
            """;
        String expectedOutput = """
            1
            7
            6
            1
            9
            """;

        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            3
            4 4
            5 0
            10 1
            """;
        String expectedOutput = """
            6
            1
            10
            """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_3() throws IOException {
        String input = """
            8
            10 11
            4 7
            10 2
            20 1
            4 2
            2 3
            98 5
            99 999999
            """;
        String expectedOutput = """
            10
            4
            10
            10
            6
            8
            8
            9
            """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_4() throws IOException {
        String input = """
            1
            100 2
            """;
        String expectedOutput = """
            10
            """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
